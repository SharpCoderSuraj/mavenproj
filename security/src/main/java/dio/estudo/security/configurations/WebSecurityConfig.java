package dio.estudo.security.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import dio.estudo.security.service.SecurityDatabaseService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig{
    @Autowired
    private SecurityDatabaseService securityService;


    /*@Bean
    public UserDetailsService userDetailsService(){
        UserBuilder users = User.withDefaultPasswordEncoder();
        UserDetails user = users.username("Pedro").password("senha123").roles("USER").build();
        UserDetails adm = users.username("admin").password("senha123").roles("USER", "ADMIN").build();
        return new InMemoryUserDetailsManager(user, adm);
    }*/

    @Autowired
    public void globalUserDetails(AuthenticationManagerBuilder auhtz) throws Exception{
        auhtz.userDetailsService(securityService).passwordEncoder(NoOpPasswordEncoder.getInstance());
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(auhtz -> auhtz.requestMatchers("/").permitAll()
        .requestMatchers(HttpMethod.POST, "/login").permitAll()
        .requestMatchers("/admin").hasAnyRole("ADMIN")
        .requestMatchers("/users").hasAnyRole("ADMIN", "USER")
        .anyRequest().authenticated()).formLogin((login) -> login.loginPage("/login").permitAll()).logout(logout -> logout.permitAll()).httpBasic(Customizer.withDefaults());
        return http.build();
    }
}

package dio.treino.aprendizado.aula04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "remetente")
public class Remetente {
    
    private String nome;
    private String email;
    private String telefones;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefones() {
        return telefones;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefones(String telefones) {
        this.telefones = telefones;
    }
    
    public Remetente(){}

    public Remetente(String nome, String email, String telefones){
        this.nome = nome;
        this.email = nome;
        this.telefones = telefones;
    }
}

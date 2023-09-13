package dio.estudo.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import dio.estudo.security.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    @Query("SELECT e FROM User e JOIN FETCH e.roles WHERE e.username = (:username)")
    public User findByUsername(String username);
}

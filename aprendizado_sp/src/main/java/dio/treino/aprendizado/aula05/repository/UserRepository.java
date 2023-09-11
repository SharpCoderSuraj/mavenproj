package dio.treino.aprendizado.aula05.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import dio.treino.aprendizado.aula05.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    
    List<User> findByNomeLike(String name);

    /*@Query("SELECT u FROM tb_user WHERE u.nome LIKE %:name%")
    List<User> filtrarPorNome(@Param("name") String name);*/
}

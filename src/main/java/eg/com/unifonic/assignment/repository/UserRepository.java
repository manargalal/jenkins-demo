package eg.com.unifonic.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eg.com.unifonic.assignment.domain.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{

}

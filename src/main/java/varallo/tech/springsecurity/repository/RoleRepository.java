package varallo.tech.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import varallo.tech.springsecurity.entities.Role;

import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}

package securitydemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import securitydemo.model.AppUser;

import java.util.Optional;

@Repository
public interface IAppUserRepo extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByName(String name);
}

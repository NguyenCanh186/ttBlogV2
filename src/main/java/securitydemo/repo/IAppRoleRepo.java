package securitydemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import securitydemo.model.AppRole;

@Repository
public interface IAppRoleRepo extends JpaRepository<AppRole, Long> {

    AppRole findByName(String name);

}

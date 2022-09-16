package securitydemo.service.appUserService;

import org.springframework.security.core.userdetails.UserDetailsService;
import securitydemo.model.AppUser;
import securitydemo.service.IGeneralService;

public interface IAppUserService extends IGeneralService<AppUser>, UserDetailsService {

    AppUser findByName(String name);
}

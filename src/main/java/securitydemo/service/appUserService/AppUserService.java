package securitydemo.service.appUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import securitydemo.model.AppUser;
import securitydemo.model.DTO.UserPrinciple;
import securitydemo.repo.IAppUserRepo;

import java.util.Optional;

@Service
public class AppUserService implements IAppUserService {

    @Autowired
    private IAppUserRepo appUserRepo;

//    @Autowired
//    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AppUser> userOptional = appUserRepo.findByName(username);
        if (userOptional.isPresent()){
            return UserPrinciple.build(userOptional.get());
        }
        return null;
    }

    @Override
    public Iterable<AppUser> findAll() {
        return appUserRepo.findAll();
    }

    @Override
    public Optional<AppUser> findById(Long id) {
        return appUserRepo.findById(id);
    }

    @Override
    public AppUser save(AppUser appUser) {
        return appUserRepo.save(appUser);
    }

    @Override
    public void remove(Long id) {
        appUserRepo.deleteById(id);
    }

    @Override
    public AppUser findByName(String name) {
        return appUserRepo.findByName(name).get();
    }
}

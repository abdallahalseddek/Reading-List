package user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService implements UserDetailsRepo {

    @Autowired private UserRepo userRepo;
    @Override public UserDetails loadUserByUserName(String userName) throws UsernameNotFoundException {
        User user = userRepo.findByUserName(userName);
        if (user != null){
        return user;}
        throw new UsernameNotFoundException(
                userName + "' not found");
    }
}

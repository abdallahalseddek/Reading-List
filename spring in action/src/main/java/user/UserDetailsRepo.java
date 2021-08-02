package user;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepo {
    UserDetails loadUserByUserName(String userName) throws UsernameNotFoundException;
}

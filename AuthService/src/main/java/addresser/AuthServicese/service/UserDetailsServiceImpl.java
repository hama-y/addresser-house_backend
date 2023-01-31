package addresser.AuthServicese.service;

import addresser.AuthServicese.entity.UserTableEntity;
import addresser.AuthServicese.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

//    private static List<String> usernameList = Arrays.asList("nyasba", "admin");
//    private static String ENCRYPTED_PASSWORD = "$2a$10$5DF/j5hHnbeHyh85/0Bdzu1HV1KyJKZRt2GhpsfzQ8387A/9duSuq"; // "password"を暗号化した値

    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String mailaddress) throws UsernameNotFoundException {

        Optional<UserTableEntity> user = userRepository.findBymailaddress(mailaddress);

        // 本来ならここでDBなどからユーザを検索することになるが、サンプルのためリストに含まれるかで判定している
//        if(!usernameList.contains(username)){
//            throw new UsernameNotFoundException(username);
//        }

        return User.withUsername(user.get().getMailaddress())
                .password(user.get().getPassword())
                .authorities("ROLE_USER") // ユーザの権限
                .build();
    }

}


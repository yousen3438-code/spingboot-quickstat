package org.example.spingbootquickstat.ServiceImpl;
import org.example.spingbootquickstat.dao.User;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.example.spingbootquickstat.Mapper.UserMapper;
import org.example.spingbootquickstat.Service.UserService;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserMapper userMapper, PasswordEncoder passwordEncoder) {
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public boolean login(String username, String rawPassword) {
        User user =userMapper.findUserByUsername(username);
        if (user!=null){
            System.out.println(passwordEncoder.matches(rawPassword,user.getPassword()));
            return passwordEncoder.matches(rawPassword,user.getPassword());
        }
        return false;
    }
}

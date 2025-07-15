package com.ecommerce.authservice.service;

import java.util.Set;
import com.ecommerce.authservice.domain.User;
import com.ecommerce.authservice.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository,
                       BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    public User findByUsername(String username) {
        return userRepository.findByUsername(username).orElse(null);
    }      

    public User register(String username, String rawPassword) {
        String encoded = passwordEncoder.encode(rawPassword);
        User user = User.builder()
                        .username(username)
                        .password(encoded)
                        .roles(Set.of("ROLE_USER"))
                        .build();
        return userRepository.save(user);
    }
}

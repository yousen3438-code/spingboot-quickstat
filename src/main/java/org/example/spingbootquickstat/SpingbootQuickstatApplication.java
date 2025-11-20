package org.example.spingbootquickstat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@SpringBootApplication
public class SpingbootQuickstatApplication {

    @Bean
    public PasswordEncoder passwordEncoder() {
        // 使用 BCrypt 加密算法
        return new BCryptPasswordEncoder();
    }
    public static void main(String[] args) {
        SpringApplication.run(SpingbootQuickstatApplication.class, args);
    }

}

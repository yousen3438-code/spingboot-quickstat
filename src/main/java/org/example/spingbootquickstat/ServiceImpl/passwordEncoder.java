package org.example.spingbootquickstat.ServiceImpl;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class passwordEncoder {
    public static void main(String[] args) {
        PasswordEncoder encoder = new BCryptPasswordEncoder();

        // 原始密码
        String rawPassword = "Wjdn13141314.,";

        // 生成密文
        String encodedPassword = encoder.encode(rawPassword);

        System.out.println("原始密码: " + rawPassword);
        System.out.println("加密后的密文: " + encodedPassword);

        // 验证密码
        boolean matches = encoder.matches(rawPassword, encodedPassword);
        System.out.println("验证结果: " + matches);
    }
}
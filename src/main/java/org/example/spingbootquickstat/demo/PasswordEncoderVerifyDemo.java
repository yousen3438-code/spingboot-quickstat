package org.example.spingbootquickstat.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderVerifyDemo {
    public static void main(String[] args) {
        PasswordEncoder encoder = new BCryptPasswordEncoder();

        // 原始密码
        String rawPassword = "Wjdn13141314.,";

        // 已加密的密文（通常存储在数据库中）
        String encodedPassword = "$2a$10$7dXPDR99G8f3CFYi4RgrEe3tDDsZ3A9tCZ45QPoWE.U3cjZX2PW0W";

        // 验证原始密码和密文是否匹配
        boolean matches = encoder.matches(rawPassword, encodedPassword);

        System.out.println("原始密码: " + rawPassword);
        System.out.println("密文: " + encodedPassword);
        System.out.println("验证结果: " + matches);
    }
}
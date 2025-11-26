package org.example.spingbootquickstat.Util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;
@Component
public class JwtUtil {
    @Value("${jwt.secret}")
    private void init(String secret) {
        this.SECRET = secret;
    }
    private static String SECRET;

    private static Key KEY;
    @PostConstruct
    public void JwtUtil() {
        this.KEY = Keys.hmacShaKeyFor(SECRET.getBytes(StandardCharsets.UTF_8));
    }
    public static String generateToken(String username) {
//        System.out.println(getSECRET);
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 3600_000)) // 1小时有效
                .signWith(KEY,SignatureAlgorithm.HS256)
                .compact();
    }
}

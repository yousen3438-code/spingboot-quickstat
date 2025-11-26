package org.example.spingbootquickstat;

import jakarta.annotation.PostConstruct;
import org.example.spingbootquickstat.Util.JwtUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.beans.factory.annotation.Value;
@SpringBootTest
public class RedisTest {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;



    @Test
    public void testSte(){
        ValueOperations<String,String> operations = stringRedisTemplate.opsForValue();
        operations.set("user","name");
    }
    @Value("${jwt.secret}")
    private String secret;
    private final String getSecret = "MySuperSecureSecretKeyThatIsAtLeast32BytesLong";
//    @Test
//    public void init() {
//        System.out.println("JWT Secret = " + secret);
//    }
//    private final JwtUtil jwtUtil;
//    public RedisTest(JwtUtil jwtUtil) {
//        this.jwtUtil = jwtUtil;
//    }
    @Autowired
    private JwtUtil jwtUtil;
    @Test
    public void jwtSte(){
        String user = "yousen";
        String token = jwtUtil.generateToken(user);
        System.out.println(secret);
        System.out.println(getSecret);
        System.out.println(token);
    }
}

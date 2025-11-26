package org.example.spingbootquickstat.controller;

import org.example.spingbootquickstat.ServiceImpl.UserServiceImpl;
import org.example.spingbootquickstat.Util.JwtUtil;
import org.example.spingbootquickstat.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final UserServiceImpl userServiceImpl;

    private final JwtUtil jwtUtil;
    public AuthController(UserServiceImpl userServiceImpl, JwtUtil jwtUtil) {
        this.userServiceImpl = userServiceImpl;
        this.jwtUtil = jwtUtil;
    }
    @PostMapping("/login")
    public ResponseEntity<?> Login(@RequestBody User user) {
        System.out.println(user);
        if (userServiceImpl.login(user.getUsername(),user.getPassword())) {
            String token = jwtUtil.generateToken(user.getUsername());
            return ResponseEntity.ok(Map.of(
                    "message","登录成功",
                    "token",token
            ));
        }
        throw new IllegalArgumentException("输入密码有误");
    }
}

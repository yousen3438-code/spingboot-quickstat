package org.example.spingbootquickstat.controller;

import org.example.spingbootquickstat.ServiceImpl.UserServiceImpl;
import org.example.spingbootquickstat.dao.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final UserServiceImpl userServiceImpl;

    public AuthController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @PostMapping("/login")
    public String Login(@RequestBody User user) {
        System.out.println(user);
        if (userServiceImpl.login(user.getUsername(),user.getPassword())) {
            return "登录成功";
        }
        throw new IllegalArgumentException("输入密码有误");
    }
}

package org.example.spingbootquickstat.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//登录身份实体
@Data
@NoArgsConstructor   // 自动生成无参构造
@AllArgsConstructor  // 自动生成全参构造
public class LoginResponse {

    private Integer userId;     // 用户ID
    private String username;    // 用户名
    private String token;       // 登录令牌
    private Long expireAt;
}

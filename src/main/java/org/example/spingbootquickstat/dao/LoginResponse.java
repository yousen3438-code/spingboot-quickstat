package org.example.spingbootquickstat.dao;
//登录身份实体
public class LoginResponse {

    private Integer userId;     // 用户ID
    private String username;    // 用户名
    private String token;       // 登录令牌
    private Long expireAt;      // 过期时间戳（毫秒）

    public LoginResponse() {}

    public LoginResponse(Integer userId, String username, String token, Long expireAt) {
        this.userId = userId;
        this.username = username;
        this.token = token;
        this.expireAt = expireAt;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(Long expireAt) {
        this.expireAt = expireAt;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", token='" + token + '\'' +
                ", expireAt=" + expireAt +
                '}';
    }
}

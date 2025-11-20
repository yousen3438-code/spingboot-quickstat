package org.example.spingbootquickstat.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.spingbootquickstat.dao.User;

@Mapper
public interface UserMapper {
//    根据用户名查询用户
    @Select("SELECT id,username,password from users where username = #{username}")
    User findUserByUsername(String username);
}

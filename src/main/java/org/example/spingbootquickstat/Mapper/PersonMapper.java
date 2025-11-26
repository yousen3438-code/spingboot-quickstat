package org.example.spingbootquickstat.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.spingbootquickstat.entity.Person;

import java.util.List;

@Mapper
public interface PersonMapper {

    // 查询所有数据
    @Select("SELECT * FROM person_info")
    List<Person> findAll();

    // 根据主键查询
    @Select("SELECT * FROM person_info WHERE id = #{id}")
    Person findById(Integer id);

    // 根据名字模糊查询
    @Select("SELECT * FROM person_info WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Person> findByName(String name);
}
package org.example.spingbootquickstat.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor   // 自动生成无参构造
@AllArgsConstructor  // 自动生成全参构造
public class Person {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private String phone;
}


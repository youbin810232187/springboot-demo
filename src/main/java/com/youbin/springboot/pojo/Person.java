package com.youbin.springboot.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @program: springboot-demo
 * @description: pojo.Person
 * @author: Mr.You
 * @create: 2019-03-14 19:04
 **/
@Component
@Data
@ToString
//@PropertySource(value = {"classpath:person.properties"})
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {
//    @Value(value = "${person.name}")
    private String name;
//    @Value(value = "${person.age}")
    private Integer age;
//    @Value(value = "${person.birth}")
    private Date birth;
//    @Value(value = "${person.boss}")
    private Boolean boss;
//    @Value(value = "${person.email}")
    @Email
    private  String email;
//    @Value(value = "${person.maps}")
    private Map<String,String> maps;
//    @Value(value = "${person.list}")
    private List<String> list;
//    @Value(value = "${person.friend}")
    private Friend friend;
}

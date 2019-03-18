package com.youbin.springboot.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @program: springboot-demo
 * @description:
 * @author: Mr.You
 * @create: 2019-03-16 15:48
 **/
@Data
@ToString
public class Student {
    private String name;
    private Integer age;
    private Date birth;
}

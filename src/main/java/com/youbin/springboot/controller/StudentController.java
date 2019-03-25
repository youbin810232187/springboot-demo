package com.youbin.springboot.controller;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.youbin.springboot.pojo.Student;
import com.youbin.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: springboot-demo
 * @description:
 * @author: Mr.You
 * @create: 2019-03-23 12:33
 **/
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable  Integer id){
        return  studentService.getStudentById(id);
    }

    @PostMapping("/student")
    public String addStudent(Student student){
        System.out.println(student);
        int id = studentService.addStudent(student);
        student.setId(id);
        return student.toString();
    }

    @PutMapping("/student")
    public String updateStudent(Student student){

        return  null;
    }

}

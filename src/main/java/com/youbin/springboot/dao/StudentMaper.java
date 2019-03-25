package com.youbin.springboot.dao;

import com.youbin.springboot.pojo.Student;

import java.util.List;

/**
 * @program: springboot-demo
 * @description:
 * @author: Mr.You
 * @create: 2019-03-23 12:20
 **/
public interface StudentMaper {

    public Student getStudentById(Integer id);

    public void updateStudent(Student student);

    public void deleteStudentById(Integer id);

    public int addStudent(Student student);

    public List<Student> listStudens();

}

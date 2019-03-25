package com.youbin.springboot.service;

import com.youbin.springboot.dao.StudentMaper;
import com.youbin.springboot.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: springboot-demo
 * @description:
 * @author: Mr.You
 * @create: 2019-03-23 12:19
 **/
@Service
public class StudentService {

    @Autowired
    private  StudentMaper studentMaper;

    public Student getStudentById(Integer id){
        return studentMaper.getStudentById(id);
    }

    public void updateStudent(Student student){
         studentMaper.updateStudent(student);
    }


    public void deleteStudentById(Integer id){
        studentMaper.deleteStudentById(id);
    }

    @Transactional
    public int addStudent(Student student){
        int i = studentMaper.addStudent(student);

        System.out.println("i = " + i);
        i = 1/student.getAge();
       return i;
    }

    public List<Student> listStudens(){
        return studentMaper.listStudens();
    }
}

package com.youbin.springboot.controller;

import com.youbin.springboot.pojo.Person;
import com.youbin.springboot.pojo.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;

/**
 * @program: springboot-demo
 * @description:
 * @author: Mr.You
 * @create: 2019-03-11 18:54
 **/
@RestController
public class HelloController {
    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private Environment environment;

    @Autowired
    Person person;

    @GetMapping("/person/{id}")
    public Student testTest(@PathVariable Integer id){
        Student student = new Student();
        student.setName("youbin");
        student.setAge(id);
        student.setBirth(new Date("2019/01/01"));
        return  student;
    }

    @GetMapping("/hello")
    public String hello(){
        return  "hello";
    }

    @GetMapping("/env")
    public String testenv(){
        String javaHome = environment.getProperty("JAVA_HOME");
        return  javaHome;
    }

    @GetMapping("/timeout")
    public String testTimeut(){
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  "hello";
    }

    @RequestMapping("/httpMethod")
    public String testHttpMwthod(HttpMethod httpMethod, String name,Model model){
        System.out.println(httpMethod.toString());
        System.out.println(model.containsAttribute("name"));
        return  httpMethod.toString();
    }

    @PostMapping ("/person")
    public String testPerson(Student student){
        if(student != null){
            return  student.toString();
        }
        return  null;
    }

    @GetMapping(value = "/test3",headers = "name=yb")
    public String test3(HttpServletRequest request){
        System.out.println(request.toString());
        return "test3";
    }

    @GetMapping(value = "/test2",params = "name=yb")
    public String test2(){
        return "test2";
    }

    @GetMapping(value = "/testconsumes/{id}",consumes = "application/json")
    public String testConsumes(@PathVariable("id") Integer id){
        return "testConsumes" + id;
    }
    @GetMapping("/msg/{id}")
    public String getMsg(@PathVariable("id") Integer id){
        logger.info("id=" + id);
        return "studnet" + id;
    }

    @GetMapping("/getperson")
    public String getPerson() {
        System.out.println("haha...");
        logger.trace("这是trace打印");
        logger.debug("这是debug打印");
        logger.info("这是info打印");
        logger.warn("这是warn打印");
        logger.error("这是error打印");
        return person.toString();
    }
}

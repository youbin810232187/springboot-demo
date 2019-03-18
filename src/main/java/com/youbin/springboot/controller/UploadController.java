package com.youbin.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import sun.rmi.runtime.Log;

import java.io.File;
import java.io.IOException;

/**
 * @program: springboot-demo
 * @description:文件上传
 * @author: Mr.You
 * @create: 2019-03-16 16:21
 **/
@RestController
public class UploadController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file){
        if (file.isEmpty()){
            return "文件为空，请选择文件重新上传！";
        }
        String filename = file.getOriginalFilename();
        String filepath = "C:\\Users\\Administrator\\Desktop\\tmp";
        System.out.println(filepath+filename);
        File destfile = new File(filepath+ "\\" + filename);
        try {
            file.transferTo(destfile);
            logger.info("上传成功");
            return "success";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败，请重新上传！";

    }
}

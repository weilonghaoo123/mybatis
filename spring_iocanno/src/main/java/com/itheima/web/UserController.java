package com.itheima.web;

import com.itheima.config.SpringConfig;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserController {
    public static void main(String[] args) {
//        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
        ((AnnotationConfigApplicationContext) app).close();
    }


}

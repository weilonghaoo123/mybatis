package com.itheima.test;

import com.itheima.config.SpringConfig;
import com.itheima.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")//根据xml配置文件
@ContextConfiguration(classes = SpringConfig.class)
public class SpringJunitTest {
    @Autowired
    @Qualifier("userService")
    private UserService userService;
    @Test
    public void test01() {
        userService.save();
    }
}

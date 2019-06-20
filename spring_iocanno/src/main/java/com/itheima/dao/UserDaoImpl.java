package com.itheima.dao;

import com.itheima.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//让spring创建对象
// <bean id="userDao" class="UserDaoImpl"></bean>
//@Component("userDao")
@Repository("userDao")//id=userDao
public class UserDaoImpl implements UserDao {
    @Value("${jdbc.driver}")
    private String driver;

    public void save() {
        System.out.println(driver);
        System.out.println("save running...");
    }
    @PostConstruct
    public void init(){
        System.out.println("service对象初始化方法。。。");
    }
    @PreDestroy
    public void destory(){
        System.out.println("service对象销毁的方法。。。");
    }
}

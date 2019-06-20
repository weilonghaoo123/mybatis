package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Component("userService")
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired //通过类型注入。
    @Qualifier("userDao")//根据id的值在spring容器中匹配的.//ref="userDao"
//    @Resource(name = "userDao")
    private UserDao userDao;

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }用xml必须有set方法（反射得到userDao），注解的话就不需要了set方法了，注解的话直接通过 @Autowired反射注入。


    public void save() {
        userDao.save();
    }
}

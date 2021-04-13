package com.lxx.service;

import com.lxx.dao.UserDao;


public class UserServiceImpl implements UserService {
    /*以下代码这样写就写死了，如果需求更改需要修改代码，这样很不方便*/
    //private UserDao userDao=new UserDaoImpl();
    //private UserDao userDao=new UserDaoMysqlImpl();
    //private UserDao userDao=new UserDaoOracleImpl();
    private UserDao userDao;

    /*利用set进行动态实现值的注入*/

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}

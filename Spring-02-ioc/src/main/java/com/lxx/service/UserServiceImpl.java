package com.lxx.service;

import com.lxx.dao.UserDao;
import com.lxx.dao.UserDaoMysqlImpl;
import com.lxx.dao.UserDaoOracleImpl;

public class UserServiceImpl implements  UserService {
  private   UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}

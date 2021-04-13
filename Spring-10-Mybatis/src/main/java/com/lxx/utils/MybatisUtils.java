package com.lxx.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//在java中创建com.lxx.utils包 在包中创建MybatisUtils类
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    //因为这三条代码是死的，所以封装成工具类（从官网获取）
    static {

        try {
            //使用Mybatis第一步获取sqlSessionFactory对象
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //既然有了 SqlSessionFactory，顾名思义，我们可以从中获得 SqlSession 的实例。
    //sqlSession完全包含了面向数据库执行SQL命令所需要的所有方法
    public  static SqlSession getSqlSession(){
       /*SqlSession sqlSession= sqlSessionFactory.openSession();
        return sqlSession;*/
        //代码优化
        return sqlSessionFactory.openSession();
    }
}

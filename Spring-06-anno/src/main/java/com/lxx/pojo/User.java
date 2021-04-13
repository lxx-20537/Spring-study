package com.lxx.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/*等价于  <bean id="user" class="com.lxx.pojo.User"/>*/
/*@Component 组件*/
@Component
@Scope("singleton")//prototype
public class User {

   @Value("小爱同学1")//相当于<property name="name" value="小爱同学1"></property>
    public  String name ;


}

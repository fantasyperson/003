package com.lanou.demo04.service;

import com.lanou.demo04.bean.Person;

public interface PersonService {
    //根据用户名查询用户信息
    public Person findPersonByUsername(String username);
}

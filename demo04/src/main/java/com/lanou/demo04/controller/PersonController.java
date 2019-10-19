package com.lanou.demo04.controller;

import com.alibaba.fastjson.JSON;
import com.lanou.demo04.bean.Person;
import com.lanou.demo04.service.PersonService;
import org.springframework.cache.annotation.Cacheable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("person")
public class PersonController {
private PersonService personService;
@Cacheable(value = "findPersonByUsername")
    @RequestMapping("findPersonByUsername")
public String findPersonByUsername(String username){
    Person person = personService.findPersonByUsername(username);
    return JSON.toJSONString(person);
}
}

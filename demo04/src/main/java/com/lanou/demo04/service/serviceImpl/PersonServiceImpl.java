package com.lanou.demo04.service.serviceImpl;

import com.lanou.demo04.bean.Person;
import com.lanou.demo04.mapper.PersonMapper;
import com.lanou.demo04.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;

    @Override
    public Person findPersonByUsername(String username) {
        return personMapper.findPersonByUsername(username);
    }
}

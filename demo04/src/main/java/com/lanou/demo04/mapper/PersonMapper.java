package com.lanou.demo04.mapper;

import com.lanou.demo04.bean.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface PersonMapper {
    //根据用户名查询用户信息
   public Person findPersonByUsername(String username);

   //


}

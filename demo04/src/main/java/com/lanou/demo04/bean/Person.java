package com.lanou.demo04.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Person {
    private Integer id;
    private String username;
    private String password;
    private String telephone;
    private String department;
}

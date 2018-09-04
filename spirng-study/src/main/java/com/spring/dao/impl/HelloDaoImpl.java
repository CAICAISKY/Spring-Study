package com.spring.dao.impl;

import com.spring.dao.HelloDao;
import org.springframework.stereotype.Repository;

@Repository
public class HelloDaoImpl implements HelloDao {
    public void savehello() {
        System.out.println("save a hello");
    }
}

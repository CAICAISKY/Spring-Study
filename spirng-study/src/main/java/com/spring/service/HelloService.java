package com.spring.service;

import com.spring.dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Autowired
    private HelloDao helloDao;

    public void testAutowired() {
        helloDao.savehello();
    }
}

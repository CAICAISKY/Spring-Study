package com.spring.txManager.service.impl;

import com.spring.txManager.dao.MoneyDao;
import com.spring.txManager.dao.impl.MoneyDaoImpl;
import com.spring.txManager.service.MoneyService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service
@Transactional(rollbackFor = Throwable.class)
public class MoneyServiceImpl implements MoneyService{

    @Resource(name = "moneyDaoImpl")
    private MoneyDao moneyDao;

    public void moneyAccount(Integer num, String userNameForPlus, String userNameForReduce) {
        moneyDao.account(num, userNameForPlus, userNameForReduce);
    }
}

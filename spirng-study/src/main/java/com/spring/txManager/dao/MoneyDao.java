package com.spring.txManager.dao;

import javax.sql.DataSource;

public interface MoneyDao {
    void account(Integer num, String userNameForPlus, String userNameForReduce);
}

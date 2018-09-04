package com.spring.txManager.dao.impl;

import com.alibaba.druid.pool.DruidDataSource;
import com.spring.txManager.dao.MoneyDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Repository
public class MoneyDaoImpl implements MoneyDao {

    @Resource
    private DataSource dataSource;

    public void account(Integer num, String userNameForPlus , String userNameForReduce) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String sqlPlus = "UPDATE money m SET money = (m.money + ?) WHERE user = ?";
        String sqlReduce = "UPDATE money m SET money = (m.money - ?) WHERE user = ?";
        jdbcTemplate.update(sqlReduce, num, userNameForReduce);
        int i = 1 / 0;
        jdbcTemplate.update(sqlPlus, num, userNameForPlus);
    }
}

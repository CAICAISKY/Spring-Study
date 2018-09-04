package com.spring.test;

import com.spring.txManager.service.MoneyService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;

public class TransactionTest {
    //定义一个某个框架平台的TransactionManager，如JDBC、Hibernate
    @Test
    public void testTransaction() throws Exception {
        //创建事务管理器、这里使用的是JDBC的事务管理器
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MoneyService moneyService = (MoneyService) applicationContext.getBean("moneyServiceImpl");
        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        // 设置数据源
        dataSourceTransactionManager.setDataSource(dataSource);
        // 定义事务属性
        DefaultTransactionDefinition transDef = new DefaultTransactionDefinition();
        // 设置传播行为属性
        transDef.setPropagationBehavior(DefaultTransactionDefinition.PROPAGATION_REQUIRED);
        // 获得事务状态
        TransactionStatus status = dataSourceTransactionManager.getTransaction(transDef);
        try {
            moneyService.moneyAccount(1000, "laobi", "Schuyler");
            dataSourceTransactionManager.commit(status);
        } catch (Exception e) {
            dataSourceTransactionManager.rollback(status);
            e.printStackTrace();
        }
    }

    @Test
    public void testAOPTransaction() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MoneyService moneyService = (MoneyService) applicationContext.getBean("moneyServiceImpl");
        moneyService.moneyAccount(100000, "laobi", "Schuyler");
    }
}

package com.phr.test;

import com.phr.config.AppConfig;
import com.phr.dao.OrderDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        OrderDao orderDao = (OrderDao) annotationConfigApplicationContext.getBean("orderDao");
        orderDao.query();
    }
}

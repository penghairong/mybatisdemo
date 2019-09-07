package com.phr.service;

import com.phr.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class CardService {

    @Autowired
    OrderDao orderDao;

    public void list(){
        System.out.println(orderDao.query().toString());
    }
    @PostConstruct
    public void init(){

    }
}

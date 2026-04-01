package com.walidzaaneun.dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        return Math.random()*10;
    }
}

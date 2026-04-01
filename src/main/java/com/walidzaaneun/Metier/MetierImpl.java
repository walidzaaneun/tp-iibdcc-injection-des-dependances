package com.walidzaaneun.Metier;

import com.walidzaaneun.dao.DaoImpl;
import com.walidzaaneun.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{

    @Autowired
    private IDao iDao;

    public MetierImpl(IDao iDao) {
        this.iDao = iDao;
    }
    public MetierImpl() {
    }

    @Override
    public double calcul() {
        return iDao.getData() * Math.random()*10;
    }

    public void setiDao(IDao iDao) {
        this.iDao = iDao;
    }
}

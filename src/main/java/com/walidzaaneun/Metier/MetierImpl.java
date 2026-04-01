package com.walidzaaneun.Metier;

import com.walidzaaneun.dao.DaoImpl;
import com.walidzaaneun.dao.IDao;

public class MetierImpl implements IMetier{
    public void setiDao(IDao iDao) {
        this.iDao = iDao;
    }

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
}

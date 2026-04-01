package com.walidzaaneun.Metier;

import com.walidzaaneun.dao.IDao;

public class MetierImpl implements IMetier{
    private IDao iDao;

    public MetierImpl(IDao iDao) {
        this.iDao = iDao;
    }

    @Override
    public double calcul() {
        return iDao.getData() * Math.random()*10;
    }
}

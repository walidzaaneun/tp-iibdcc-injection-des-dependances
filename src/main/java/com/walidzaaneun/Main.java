package com.walidzaaneun;

import com.walidzaaneun.Metier.MetierImpl;
import com.walidzaaneun.dao.DaoImpl;

public class Main {
    public static void main(String[] args) {
        // Injection Par instanciation statique
        DaoImpl daoImpl = new DaoImpl();
        MetierImpl metierImpl = new MetierImpl(daoImpl);
        System.out.println("calcul = "+metierImpl.calcul());
    }
}
package com.walidzaaneun;

import com.walidzaaneun.Metier.IMetier;
import com.walidzaaneun.Metier.MetierImpl;
import com.walidzaaneun.dao.DaoImpl;
import com.walidzaaneun.dao.IDao;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // Injection Par instanciation statique
        DaoImpl daoImpl = new DaoImpl();
        MetierImpl metierImpl = new MetierImpl(daoImpl);
        System.out.println("calcul = "+metierImpl.calcul());


        // Injection  Par instanciation dynamique
        Scanner sc = new Scanner(new File("config.txt"));
        String doaClassName = sc.nextLine();
        Class cDao = Class.forName(doaClassName);
        IDao dao= (IDao) cDao.newInstance();

        String metierClassName = sc.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);
        System.out.println("calcul = "+metier.calcul());


    }
}
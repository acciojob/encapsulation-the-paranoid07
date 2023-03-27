package com.driver;

import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {
        RWOnly obj =new RWOnly();

        //System.out.println(obj.name="manu");

        obj.setName("Manu");

        System.out.println(obj.getName());
    }
}
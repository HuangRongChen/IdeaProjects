package com.geekbang.supermarket;

import chap007.Mobile;

public class MobileTest {

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.setName("张");
        m1.setMonney(100);

//        System.out.println(m1.setMonney());
        System.out.println(m1.getMonney());

        Mobile m2 = new Mobile();
        m2.setName("李");
        m2.setMonney(200);
    }

}

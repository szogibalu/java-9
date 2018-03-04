package com.szogibalu.examples;

import com.szogibalu.examples2.export.Examples;

import java.lang.reflect.Method;

import static javax.xml.XMLConstants.XML_NS_PREFIX;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Modules!");

        System.out.println("The XML namespace prefix is: " + XML_NS_PREFIX);

        System.out.println(new Examples().getHi());

        try {
            Class c = Class.forName("com.szogibalu.examples2.open.Examples");
            Method m = c.getMethod("getHi");
            System.out.println(m.invoke(c.getDeclaredConstructor().newInstance()));
        } catch (Throwable e) {
            System.err.println(e);
        }

        Service.getInstance().printServiceNames();
    }

}

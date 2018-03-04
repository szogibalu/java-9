package com.szogibalu.examples;

import com.szogibalu.examples2.Examples;

import static javax.xml.XMLConstants.XML_NS_PREFIX;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Modules!");

        System.out.println("The XML namespace prefix is: " + XML_NS_PREFIX);

        System.out.println(new Examples().getHi());
    }

}

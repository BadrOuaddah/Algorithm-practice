package com.badr.algorithm;

class Singleton{
    private Singleton() {

    }
    static Singleton instance = new Singleton();

    public static String str;

    static Singleton getSingleInstance() {

        return instance;
    }
}

public class JavaSingletonPattern {
    public static void main(String[] args) {

    }
}

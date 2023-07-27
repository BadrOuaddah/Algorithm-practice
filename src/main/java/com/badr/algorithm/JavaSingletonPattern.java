package com.badr.algorithm;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

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

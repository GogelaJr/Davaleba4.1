package com.company;

public class A {


    public static void one(){
        System.out.println("A1");
        System.out.println("Hello OPP");

    }
    public static int two(int a){
        System.out.println("A2");
        return a;
    }

    public static int three(int b){
        System.out.println("A3");
        return b;
    }
    public static int four(int a, int b){
        System.out.println("A4");
        return a+b;
    }
    public int five(int a, int b){
        System.out.println("A5");
        return a+b;

    }
    public int six(int a,  int b){
        System.out.println("A6");
        return a*b;
    }
    public int seven(int a, int b){
        System.out.println("A7");
        a = 5;
        b = 6;
        String a1 = String.valueOf(a);
        String b1 = String.valueOf(b);
        System.out.println(a1+" "+ b1);
        return 0;
    }

}

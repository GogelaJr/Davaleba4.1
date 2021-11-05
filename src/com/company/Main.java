package com.company;

public class Main {

    public static void main(String[] args) {
    A a= new A();
    B b= new B();
    C c = new C();
    int aa = 10;
    int ab = 29;
    String bs = "#";
    int ba =33;
    float bb = (float) 9.7;


    a.one();
    System.out.println(a.two(aa));
    System.out.println(a.three(ab));
    System.out.println(a.four(aa,ab));
    System.out.println(a.five(aa,ab));
    System.out.println(a.six(aa,ab));
    System.out.println(a.seven(aa,ab));

    b.one(bs);
    b.two(ba);
    b.three(bb);
    b.four(ba,bb);
    System.out.println(b.five(ba,bb));
    b.six(ba, bb,bs);
    b.seven(ba);
    System.out.println(b.eight(bb));

    c.one();
    c.two();
    c.three();
    c.four();
    c.five();
    c.six();






    }
}

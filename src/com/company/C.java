package com.company;

import java.util.Scanner;

public class C {
    Scanner sc = new Scanner(System.in);
    int a = 10;
    int b = 9;
    String s = "#";
    String h = "@";

    public void one(){
        System.out.println("C1");
        System.out.println(a+b);
    }
    public void two(){
        System.out.println("C2");
        System.out.println(s+b);
    }
    public void three(){
        System.out.println("C3");
        int sum = a+b;
        int mul = a*b;
        int red = a-b;
        int div = a%b;
        System.out.println("\n"+sum+"\n"+mul+"\n"+red+"\n"+div);
    }
    public void four(){
        System.out.println("C4, Enter new int for a: ");
        a = sc.nextInt();
    }
    public void five(){
        System.out.println("C5, Enter new int for b: ");
        b = sc.nextInt();
    }
    public void six(){
        System.out.println("C6, Enter new Symbol for s: ");
        s = sc.next();
        System.out.println("Enter new symbol for h: ");
        h = sc.next();
        System.out.println("New s is: "+s+"\nNew h is: "+h);
    }
}

package com.company;

import java.util.Random;
import java.util.Scanner;

public class B {
    Random rand = new Random();

    public void one(String s){
        System.out.println("B1");
        System.out.println(s);
    }
    public void two(int a){
        System.out.println("B2");
        System.out.println(a);
    }
    public void three(float b){
        System.out.println("B3");
        System.out.println(b);
    }
    public void four(int a, float b){
        System.out.println("B4");
        float sum = a - b;
        System.out.println(sum);
    }
    public float five(int a, float b){
        System.out.println("B5");
        float div = a / b;
        return div;
    }
    public void six(int a, float b, String s) {

        System.out.println("B6");
        a = rand.nextInt();
        b = rand.nextFloat();
        String chars = "~!@#$%^&*()_+?><|";
        char ss = chars.charAt(rand.nextInt(chars.length()));
        System.out.println(a +" "+b +" " + ss);

    }
    public void seven(int a){
        System.out.println("B7: Insert new Integer for a");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println(a);
    }
    public float eight(float a){
        a = a +10;
        return a;
    }

}

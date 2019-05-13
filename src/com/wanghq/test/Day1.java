package com.wanghq.test;

public class Day1 {
    public static void main(String args[]){

        byte a=1;
        short b=21;
        int c=123123;
        long d=123123123L;
        long sum=a+b+c+d;
        System.out.println(sum);

        float e1=12.123f;
        float e2=-12.123F;
        double f1=-123.123;
        double f2=12321.4d;
        double sum2=e1+e2+f1+f2;
        System.out.println(sum2);

        int g1='a';
        char g2=100;
        System.out.println("a对应的Unicode码为："+g1);
        System.out.println("100对应的字母为："+g2);

    }
}

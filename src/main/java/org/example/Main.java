package org.example;

public class Main {
    public static void main(String[] args) {
        boolean booleanVar = true;  // true/false
        byte varByte = 100; //0 -128...127
        short varShort = 30000; //0 -32768...32767
        int varInt = 199999; //0 -2^31...(2^31)-1
        long varLong = 2999999999999L; //0L -2^63...(2^63)-1
        float varFloat = 3.9f; //0.0f -3.4E+38 до 3.4E+38
        double varDouble = 2.9; //0.0 -1.7E+308 до 1.7E+308

        int a = 144; //помидоры
        int b = 313; //мясо
        int c = 182; //курица
        int d = 521; //сыр

        //арифметические операторы
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("++a = " + (++a));
        System.out.println("a++ = " + (a++));
        System.out.println("b-- = " + (a--));

        //операторы сравнения
        System.out.println("a < b = " + (a < b));
        System.out.println("b > a = " + (b > a));
        System.out.println("b == d = " + (b == d));
        System.out.println("b <= d = " + (b <= d));
        System.out.println("b >= d = " + (b >= d));
        System.out.println("a != b = " + (a != b));

        //переполнение
        System.out.println((byte) (100 + 128));
        System.out.println((short) (30000 + 2999999999999L));

        //int & double
        System.out.println("varInt + varDouble: " + (199999 + 2.9));
        System.out.println("varInt - varDouble: " + (199999 - 2.9));
    }
}
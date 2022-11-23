package com.filehandling;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while (!flag) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            try {
                int res = a / b;
                System.out.println("res = " + res);
                flag=true;
            } catch (ArithmeticException e) {
                //e.printStackTrace();
                flag=false;
                System.out.println(e);
            }
        }
    }
}

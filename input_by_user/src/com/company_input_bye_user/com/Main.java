package com.company_input_bye_user.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner a=new Scanner(System.in);
        System.out.println("Enter a and b");
        int n,m;
        n=a.nextInt();
        m=a.nextInt();
        add(n,m);
    }
    public static void add(int a,int b){
        System.out.println("the addition is = "+(a+b));
    }
}

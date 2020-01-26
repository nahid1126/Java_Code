package com.company_function.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
        add(5,4);
        int su=sub(11,5);
        System.out.println("The subtraction is = "+su);
    }

    public static void add(int a,int b)
    {
        System.out.println("The addition is = "+(a+b));
    }
    public static int sub(int a,int b){
        return (a-b);
    }
}

package com.company_multiple_class.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //array
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
       int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
             arr[i]=a.nextInt();
            System.out.println(arr[i]+" ");
        }
        int number[]={4,16,20,25,32,40,36,45};
        int other[]={2,0,5,0,2,0};
        for (int i=0;i<number.length;i++){
            try {
                System.out.println(number[i]+" / "+other[i]+" = "+number[i]/other[i]);
            }catch (ArithmeticException e){
                System.out.println("Does not divided by zero");
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("No matching element found");
            }

        }

    }
}

package com.company_array_and_arraylist.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n=input.nextInt();
        int [] array=new int[n];
        System.out.println("Enter the array elements : ");
        for (int i=0;i<n;i++){
            array[i]=input.nextInt();
        }

        //array sort
        Arrays.sort(array);
        //for each loop
        for (int x:array){
            System.out.print(x +" ");
        }
        System.out.println();
        //ArrayList
        ArrayList<Integer>data=new ArrayList<Integer>();
        for (int i=0;i<n;i++){
        data.add(input.nextInt());
        }

        //Iterator in arrylist
        Iterator itr=data.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next()+" ");
        }
        //arraylist sort
        Collections.sort(data);


        for (int d:data){
            System.out.print(d+" ");
        }


    }
}

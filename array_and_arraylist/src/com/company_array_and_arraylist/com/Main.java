package com.company_array_and_arraylist.com;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n=input.nextInt();
        Integer [] array=new Integer[n];
        System.out.println("Enter the array elements : ");
        for (int i=0;i<n;i++){
            array[i]=input.nextInt();
        }

        //array sort ascending order
        Arrays.sort(array);

        //for each loop
        for (int x:array){
            System.out.print(x +" ");
        }
        System.out.println();
        //Array sort Descending order
        Arrays.sort(array,Collections.reverseOrder());
        for (int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        //ArrayList
        System.out.println("Enter the arrayList data :");
        ArrayList<Integer>data=new ArrayList<Integer>();
        for (int i=0;i<n;i++){
        data.add(input.nextInt());
        }

        //Iterator in arrylist
        Iterator itr=data.iterator();

        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        //arraylist sort
        Collections.sort(data);


        for (int d:data){
            System.out.print(d+" ");
        }
        System.out.println();

        //ArrayList sort descending order
        Collections.sort(data,Collections.reverseOrder());
        for (int a:data) {
            System.out.print(a+" ");
        }

    }
}

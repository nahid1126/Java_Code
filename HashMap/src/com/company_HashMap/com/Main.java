package com.company_HashMap.com;

import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
	// write your code here

        //HashMap
        HashMap<Integer,String>fun=new HashMap<>();

        //Put values of Map
        fun.put(1126,"Nahid");
        fun.put(1112,"Tania");
        fun.put(1114,"Sajon");
        fun.put(1133,"Saiful");
        fun.put(1131,"Tareq");
        System.out.println(fun.get(1126));

        //check key & value
        if(fun.containsKey(1126)){
            System.out.println("Yes this value is contain \n The key of 1126 is "+ fun.get(1126));
        }
        if (fun.containsValue("Tania")){
            System.out.println("Yes tania is contain ");
            fun.remove(1112); //remove keys & values
        }
        print(fun);
        if (fun.containsValue("Nahid")){
            fun.replace(1126,"Nahid","Nahid Hasan"); //replace Nahid to Nahid Hasan
            print(fun);
        }

        fun.putIfAbsent(1112,"Tania");  //put another values if is not in Map
        print(fun);
        fun.clear();
        print(fun);

    }

    public static void print(HashMap<Integer,String>fun) {
        if(fun.isEmpty())
        {
            System.out.println("the map is empty");

        }else
            System.out.println(fun);
    }
}

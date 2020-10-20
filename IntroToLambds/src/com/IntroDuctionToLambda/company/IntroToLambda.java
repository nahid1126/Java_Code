package com.IntroDuctionToLambda.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IntroToLambda {

    static class Product{
        int id;
        String name;
        float price;

        public Product(int id, String name, float price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
    }
    public static void main(String[] args) {
        // write your code here
        //lambda
        Drawable drawable = (ID, dep) -> System.out.println("Hello!! Nahid" + ID + "\nDEP :" + dep);
        drawable.draw(1126, "CSE");

        List<String> nameList = new ArrayList<>();
        nameList.add("Nahid");
        nameList.add("Hasan");
        nameList.add("Saiful");
        nameList.add("Tareq");
        //Normal forEach loop
//        for (String names:nameList) {
//            System.out.println(names);
//        }

        //lambda foreach loop
        nameList.forEach((names) -> System.out.println(names));

        //add products
        List<Product> list=new ArrayList<>();
        list.add(new Product(1,"OnePlus",45000));
        list.add(new Product(2,"Samsung",18000));
        list.add(new Product(3,"redmi",20000));
        list.add(new Product(4,"Realme",13000));

        for (Product p:list){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }
        System.out.println("Sorting by name");
        Collections.sort(list, Comparator.comparing(p -> p.name));

        for (Product p:list){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }

//        Drawable drawable=new Drawable() {
//            @Override
//            public void draw() {
//                System.out.println("hello Nahid!!");
//            }
//        };
//        drawable.draw();
    }
}

interface Drawable {
    void draw(int ID, String dep);
}

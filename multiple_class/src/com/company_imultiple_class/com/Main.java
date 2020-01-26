package com.company_imultiple_class.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner name=new Scanner(System.in);
        System.out.println("Enter Your Name here ");
        String na=name.nextLine();

        Another ob=new Another();
        ob.nothingButFun(na);

        BigFun obj=new BigFun();
        obj.mojahobe(na);

        DakhiKIHoy da=new DakhiKIHoy();
        da.setName(na);
        System.out.println(da.getName());
        da.setRoll(1126);
        System.out.println(da.getRoll());


    }
}

package com.LarningClass.company;

public class LearningClass {

    static private CarClass myCar;

    public static void main(String[] args) {
        // write your code here
        myCar=new CarClass("TOYOTA","Allion","nahid",1500,30);
        myCar.printAllInfo();

        myCar= new CarClass("Mazda");
       System.out.println("Constructor with one pera Manufacturer Name : "+myCar.manufacturerName+"\nCC: "+myCar.engineCC);
        myCar= new CarClass();
        System.out.println("Constructor without pera Manufacturer Name: "+myCar.manufacturerName+"\nCC: "+myCar.engineCC);

        System.out.println();

        ///subcarclass
        SubCarClass mySubCar=new SubCarClass("HONDAI","style","hasan",2000,35,15,"Green");
        mySubCar.printAllInfo();

    }
}


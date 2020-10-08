package AnotherClass;

import com.LarningClass.company.*;

public class AnotherClass {
    public static void main(String[] args) {
        //creating object for learning class
        CarClass aCar=new CarClass("MITSUBISHI","lancer","hasan",2500,15,2015);
        SubCarClass aSubCar=new SubCarClass("NISSAN","350z","robi",4000,35,20,"Gray");

        //creating object for anothersubclass
        AnotherSubCar callingAnotherCar=new AnotherSubCar("PORSCHE","CareeraGT","nahid",4000,45,2019);

        aSubCar.manufacturerName="Mercedes Benz";
        aCar.printAllInfo();
        aSubCar.printAllInfo();

        callingAnotherCar.printAllInfo();

        callingAnotherCar.addAmountOfFuel(10);
        System.out.println("\n\nFuel :"+callingAnotherCar.presentAmountOfFuel());
        System.out.println("Model Name :"+callingAnotherCar.getCarModelName());
        System.out.println("ManuFacturingYear :"+callingAnotherCar.getManuFacturingYear());
        callingAnotherCar.driveCar(60);
        System.out.println("after driving the present amount of fuel "+callingAnotherCar.presentAmountOfFuel());
    }
}

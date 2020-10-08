package AnotherClass;

import com.LarningClass.company.*;

public class AnotherSubCar extends CarClass implements CarInterface{

    public AnotherSubCar() {
        super();
    }

    public AnotherSubCar(String carName) {
        super(carName);
    }

    public AnotherSubCar(String manufacturerName, String modelName, String carKeyValue, int engineCC, float fuelAmount) {
        super(manufacturerName,modelName,carKeyValue,engineCC,fuelAmount);
    }

    public AnotherSubCar(String manufacturerName, String modelName, String carKeyValue, int engineCC, float fuelAmount, int manufacturingYear) {
        super(manufacturerName,modelName,carKeyValue,engineCC,fuelAmount,manufacturingYear);
    }
    @Override
    public void driveCar(int drivindTimeInSecond) {
       CarRunTime(drivindTimeInSecond);
    }

    @Override
    public void addAmountOfFuel(int amount) {
        addFuel(amount);
    }


    @Override
    public int getManuFacturingYear() {
        return manufacturingYear;
    }

    @Override
    public String getCarModelName() {
        return getModelName();
    }
}

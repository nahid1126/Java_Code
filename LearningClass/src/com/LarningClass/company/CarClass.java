package com.LarningClass.company;

public class CarClass {
    public String manufacturerName;
    private String modelName;
    private String carKeyValue;
    public int engineCC;
    private float fuelAmount;
    final private float perSecondConsumeFuel=0.02f;
    protected int manufacturingYear;

    public CarClass() {
        modelName=new String();
        manufacturerName=new String();
        engineCC=0;
        fuelAmount=0;
        manufacturingYear=0;
    }

    public CarClass(String carName) {
        modelName=new String();
        manufacturerName= new String(carName);
        engineCC=0;
        fuelAmount=0;
        manufacturingYear=0;
    }

    public CarClass(String manufacturerName, String modelName, String carKeyValue, int engineCC, float fuelAmount) {
        this.manufacturerName = manufacturerName;
        this.modelName = modelName;
        this.carKeyValue = carKeyValue;
        this.engineCC = engineCC;
        this.fuelAmount = fuelAmount;
    }

    public CarClass(String manufacturerName, String modelName, String carKeyValue, int engineCC, float fuelAmount, int manufacturingYear) {
        this(manufacturerName,modelName,carKeyValue,engineCC,fuelAmount);
        this.manufacturingYear=manufacturingYear;
    }


    public String getModelName() {
        return modelName;
    }
    public float presentAmountOfFuel(){
        return fuelAmount;
    }

    public Boolean matchPassword(String carKeyValue) {
        return carKeyValue.equals(this.carKeyValue);
    }

    public void addFuel(float fuelAmount){
        this.fuelAmount+=fuelAmount;
    }
    public void CarRunTime(int timeSecond){
        float usedFuel=timeSecond*perSecondConsumeFuel;
        fuelAmount-=usedFuel;
    }

    public void printAllInfo(){
        System.out.println("\n\nManufacturer Name : "+manufacturerName+"\nModel Name : "+getModelName()+"\nMatch KeyValue : "+matchPassword("nahid")+"\nCar CC : "+engineCC+"\nManufacturingyear :"+manufacturingYear);

        System.out.println("Present Amount of fuel : "+presentAmountOfFuel()+"L");
        addFuel(5);
        System.out.println("After adding fuel : "+presentAmountOfFuel()+"L");

    }
}
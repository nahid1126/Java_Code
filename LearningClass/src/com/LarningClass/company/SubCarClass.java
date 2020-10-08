package com.LarningClass.company;

public class SubCarClass extends CarClass{
    private float chargeInBattery;
    private String colorString;

    public float getChargeInBattery() {
        return chargeInBattery;
    }

    public void setChargeInBattery(float chargeInBattery) {
        this.chargeInBattery = chargeInBattery;
    }

    public String getColorString() {
        return colorString;
    }

    public void setColorString(String colorString) {
        this.colorString = colorString;
    }


//    public SubCarClass() {
//        super();
//    }

    public SubCarClass(String manu,String model,String key,int cc,float fuel,float charge,String color){
        super(manu,model,key,cc,fuel);
        chargeInBattery=charge;
        colorString=color;
    }

    @Override
    public void printAllInfo(){
        super.printAllInfo();
        System.out.println("Charge in Battery : "+getChargeInBattery()+"\nColor of the Car : "+getColorString());
        CarRunTime(60);
        System.out.println("Amount of fuel after driving for 60s : "+presentAmountOfFuel()+"L");

    }
}

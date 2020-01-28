package com.company_Inner_Outer_class.com;

public class Ball {
    //Outer Class
    private String ballName;
    private int ballSize;
    public void setUpBall(){
        new Redball().setUpRedball();

    }
    //Inner Class
    class Redball{
        public void setUpRedball(){
            ballName="Nike";
            ballSize=20;
            System.out.println(ballName+" "+ballSize);
        }
    }
}

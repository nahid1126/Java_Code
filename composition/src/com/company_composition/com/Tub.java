package com.company_composition.com;

public class Tub {
    private int size;
    private Bubble b;

    public Tub(int size) {
        this.size = size;
        b.setRadius(10);
        b.setColor("Red");
    }
    public String getBubbleColor(){
        return b.getColor();
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

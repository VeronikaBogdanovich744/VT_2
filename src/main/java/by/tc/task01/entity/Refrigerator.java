package by.tc.task01.entity;

import java.sql.Ref;

public class Refrigerator extends Appliance{
    private double minTemperature;
    private double maxTemperature;
    private int height;

    /**
     * @param price same like in Oven.java
     * @param minTemperature
     * @param maxTemperature
     * @param height it is a height of the Item
     */
    public Refrigerator(int price, double minTemperature, double maxTemperature, int height) {
        this.price = price;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.height = height;
    }

    public Refrigerator(){}

    public double getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(double minTemperature) {
        this.minTemperature = minTemperature;
    }

    public double getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(double maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public String toString(){
        String result = "Type: "+this.getClass().getSimpleName()+"\n";
        result+="minTemperature: "+this.minTemperature+"\n";
        result+="maxTemperature: "+this.maxTemperature+"\n";
        result+="height: "+this.height+"\n";
        return result;
    }
}

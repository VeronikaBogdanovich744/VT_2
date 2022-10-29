package by.tc.task01.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

//@JacksonXmlRootElement(localName = "user")
public class Oven extends Appliance{
    private double maxHeatTemperature;
    private double minHeatTemperature;
    private int regimes;

    /**
     * @param price it is price of the item
     * @param maxHeatTemperature it his Max and min temperature of the item
     * @param minHeatTemperature it his Min temperature of the item
     * @param regimes it is a regimes of the item
     */
    public Oven(int price, double maxHeatTemperature, double minHeatTemperature, int regimes) {
        this.price = price;
        this.maxHeatTemperature = maxHeatTemperature;
        this.minHeatTemperature = minHeatTemperature;
        this.regimes = regimes;
    }

    public Oven(){}

    public double getMaxHeatTemperature() {
        return maxHeatTemperature;
    }

    public void setMaxHeatTemperature(double maxHeatTemperature) {
        this.maxHeatTemperature = maxHeatTemperature;
    }

    public double getMinHeatTemperature() {
        return minHeatTemperature;
    }

    public void setMinHeatTemperature(double minHeatTemperature) {
        this.minHeatTemperature = minHeatTemperature;
    }

    public int getRegimes() {
        return regimes;
    }

    public void setRegimes(int regimes) {
        this.regimes = regimes;
    }

    @Override
    public String toString(){
        String result = "Type: "+this.getClass().getSimpleName()+"\n";
        result+="maxHeatTemperature: "+this.maxHeatTemperature+"\n";
        result+="minHeatTemperature: "+this.minHeatTemperature+"\n";
        result+="regimes: "+regimes+"\n";

        return result;
    }


}

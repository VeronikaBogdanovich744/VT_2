package by.tc.task01.entity;

public class Speakers extends Appliance{
    private double powerConsumption;
    private int numberOfSpeakers;
    private int cordLength;

    /**
     * @param price same like in Oven.java
     * @param powerConsumption it is power consumption
     * @param numberOfSpeakers it is number of speakers
     * @param cordLength it is a height of the cord
     */
    public Speakers(int price, double powerConsumption, int numberOfSpeakers, int cordLength) {
        this.price = price;
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.cordLength = cordLength;
    }

    public Speakers(){}

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    public int getCordLength() {
        return cordLength;
    }

    @Override
    public String toString(){
        String result = "Type: "+this.getClass().getSimpleName()+"\n";
        result+="powerConsumption: "+this.powerConsumption+"\n";
        result+="numberOfSpeakers: "+this.numberOfSpeakers+"\n";
        result+="cordLength: "+this.cordLength+"\n";
        return result;
    }
}

package Vehicles;

public abstract class Vehicle {

    private String make;
    private String model;
    private double price;
    private String colour;
    private double engineSize;

    public Vehicle(String make, String model, double price, String colour, double engineSize){
        this.make = make;
        this.model = model;
        this.price = price;
        this.colour = colour;
        this.engineSize = engineSize;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public double getEngineSize() {
        return engineSize;
    }
}

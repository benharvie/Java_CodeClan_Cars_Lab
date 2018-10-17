package CodeClanCars;

import Vehicles.Petrol;
import Vehicles.Vehicle;
import java.util.ArrayList;

public class Dealership {

    private String name;
    private ArrayList<Vehicle> vehicles;
    private double till;

    public Dealership(String name){
        this.name = name;
        this.vehicles = new ArrayList<>();
        this.till = 50000;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public double getTill() {
        return till;
    }

    public void buyCar(Vehicle car) {
        if(getTill() > car.getPrice()){
            vehicles.add(car);
        }
    }

    public void sellCar(Vehicle car, Customer customer) {
        if(vehicles.contains(car)){
            customer.buyCar(car);
            till += car.getPrice();
            vehicles.remove(car);
        }
    }
}

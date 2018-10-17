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
        this.till = 0;
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

    public void addCar(Vehicle car) {
        vehicles.add(car);
    }
}

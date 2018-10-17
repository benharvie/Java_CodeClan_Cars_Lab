package CodeClanCars;

import Vehicles.Petrol;
import Vehicles.Vehicle;
import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Vehicle> cars;
    private double wallet;
    private boolean drivingLicense;

    public Customer(String name, double wallet, boolean drivingLicense){
        this.name = name;
        this.cars = new ArrayList<>();
        this.wallet = wallet;
        this.drivingLicense = drivingLicense;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Vehicle> getCars() {
        return cars;
    }

    public double getWallet() {
        return wallet;
    }

    public boolean hasDrivingLicense() {
        return drivingLicense;
    }

    public void buyCar(Vehicle car) {
        if(wallet >= car.getPrice() && drivingLicense){
            cars.add(car);
        }
    }
}

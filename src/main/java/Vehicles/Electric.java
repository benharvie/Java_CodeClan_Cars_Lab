package Vehicles;

public class Electric extends Vehicle {
    public Electric(String make, String model, double price, String colour, double engineSize) {
        super(make, model, price, colour, engineSize);
    }

    @Override
    public double buyPrice(Vehicle car) {
        return car.getPrice();
    }

    @Override
    public double rentPricePerDay(Vehicle car) {
        return 0;
    }
}

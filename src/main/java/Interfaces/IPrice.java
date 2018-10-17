package Interfaces;

import Vehicles.Vehicle;

public interface IPrice {
    double buyPrice(Vehicle car);
    double rentPricePerDay(Vehicle car);
}

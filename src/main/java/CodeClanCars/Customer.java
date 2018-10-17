package CodeClanCars;

public class Customer {

    private String name;
    private double wallet;
    private boolean drivingLicense;

    public Customer(String name, double wallet, boolean drivingLicense){
        this.name = name;
        this.wallet = wallet;
        this.drivingLicense = drivingLicense;
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public boolean hasDrivingLicense() {
        return drivingLicense;
    }
}

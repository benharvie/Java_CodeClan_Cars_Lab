package Components;

public class Engine extends Component {

    private double capacity;

    public Engine(String name, String make, String model, double capacity) {
        super(name, make, model);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }
}

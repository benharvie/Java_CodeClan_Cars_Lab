package Components;

public class Tyre extends Component{

    private double size;

    public Tyre(String make, String model, double size) {
        super(make, model);
        this.size = size;
    }

    public double getSize() {
        return size;
    }
}

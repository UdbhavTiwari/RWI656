class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class CarG {
    private String model;
    private Engine engine;

    public CarG(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType); // Creating Engine instance within Car
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
}
public class CompositionExampleG {
    public static void main(String[] args) {
        CarG car = new CarG("Tesla Model S", "Electric");

        System.out.println("Car Model: " + car.getModel());
        System.out.println("Engine Type: " + car.getEngine().getType());
    }
}

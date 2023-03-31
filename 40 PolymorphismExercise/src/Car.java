public class Car {

    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine() {
        return getClass() + " -> startEngine method";
    }

    public String accelerate() {
        return getClass() + " -> accelerate method";
    }

    public String brake() {
        return getClass() + " -> brake method";
    }

    public int getCylinders() {
        return this.cylinders;
    }

    public String getName() {
        return this.name;
    }


}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine method";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate method";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake method";
    }
}

class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine method";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate method";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake method";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine method";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate method";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake method";
    }
}

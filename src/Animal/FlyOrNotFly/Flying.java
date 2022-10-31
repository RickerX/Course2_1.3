package Animal.FlyOrNotFly;

import Animal.Birds;

public class Flying extends Birds {
    private String typeOfMovement;

    public Flying(String name, int age, String wednesdayOfLife, String typeOfMovement) {
        super(name, age, wednesdayOfLife);
        this.typeOfMovement = typeOfMovement;
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void fly() {

    }
}

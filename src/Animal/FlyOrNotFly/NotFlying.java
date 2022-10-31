package Animal.FlyOrNotFly;

import Animal.Birds;

public class NotFlying extends Birds {
    private String typeOfMovement;

    public NotFlying(String name, int age, String wednesdayOfLife, String typeOfMovement) {
        super(name, age, wednesdayOfLife);
        this.typeOfMovement = typeOfMovement;
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }
    public void walk() {

    }
}

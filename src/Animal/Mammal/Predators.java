package Animal.Mammal;

import Animal.Mammals;

public class Predators extends Mammals {
    private String typeOfFood;

    public Predators(String name, int age, String wednesdayOfLife, int movementSpeed, String typeOfFood) {
        super(name, age, wednesdayOfLife, movementSpeed);
        this.typeOfFood = typeOfFood;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

}

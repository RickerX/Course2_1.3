package Animal.Mammal;

import Animal.Mammals;

public class Herbivores extends Mammals {
    private String typeOfFood;

    public Herbivores(String name, int age, String wednesdayOfLife, int movementSpeed, String typeOfFood) {
        super(name, age, wednesdayOfLife, movementSpeed);
        this.typeOfFood = typeOfFood;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }
}

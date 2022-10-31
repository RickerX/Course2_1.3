package Animal;

import java.util.Objects;

public class Mammals extends Animals {
   private String wednesdayOfLife;
   private int movementSpeed;

    public Mammals(String name, int age, String wednesdayOfLife, int movementSpeed) {
        super(name, age);
        this.wednesdayOfLife = wednesdayOfLife;
        this.movementSpeed = movementSpeed;
    }

    public String getWednesdayOfLife() {
        return wednesdayOfLife;
    }

    public void setWednesdayOfLife(String wednesdayOfLife) {
        this.wednesdayOfLife = wednesdayOfLife;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public void walk() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void go() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mammals)) return false;
        Mammals mammals = (Mammals) o;
        return movementSpeed == mammals.movementSpeed && Objects.equals(wednesdayOfLife, mammals.wednesdayOfLife);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wednesdayOfLife, movementSpeed);
    }

}

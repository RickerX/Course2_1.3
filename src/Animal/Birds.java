package Animal;

import java.util.Objects;

public class Birds extends Animals {
    private String wednesdayOfLife;

    public Birds(String name, int age, String wednesdayOfLife) {
        super(name, age);
        this.wednesdayOfLife = wednesdayOfLife;
    }

    public String getWednesdayOfLife() {
        return wednesdayOfLife;
    }

    public void setWednesdayOfLife(String wednesdayOfLife) {
        this.wednesdayOfLife = wednesdayOfLife;
    }

    public void hunt() {

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
        if (!(o instanceof Birds)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(wednesdayOfLife, birds.wednesdayOfLife);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wednesdayOfLife);
    }
}

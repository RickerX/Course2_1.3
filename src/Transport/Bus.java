package Transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int yearOfRelease, String country, String color, int maxSpeed) {
        super(brand, model, yearOfRelease, country, color, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println(" можно заправлять бензином или дизелем на заправке ");
    }
}

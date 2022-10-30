package Transport;

public abstract class Transport {
   private final String brand;
   private final String model;
   private final int yearOfRelease;
   private final String country;
   private final String color;
   private final int maxSpeed;

    public Transport(String brand, String model, int yearOfRelease, String country, String color, int maxSpeed) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (yearOfRelease == 0 || yearOfRelease < 0) {
            this.yearOfRelease = 2000;
        } else {
            this.yearOfRelease = yearOfRelease;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (color != null || !color.isEmpty()) {
            this.color = color;
        } else {
            this.color = "белый";
        }
        if (maxSpeed >= 1) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 90;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public abstract void refill();
}

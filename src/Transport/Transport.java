package Transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int yearOfRelease;
    private final String country;
    private final String color;
    private final int maxSpeed;

    public Transport(String brand, String model, int yearOfRelease, String country, String color, int maxSpeed) {
        this.brand = validOrDefaultBrand(brand);
        this.model = validOrDefaultModel(model);
        this.yearOfRelease = validOrDefaultYearOfRelease(yearOfRelease);
        this.country = validOrDefaultCountry(country);
        this.color = validOrDefaultColor(color);
        this.maxSpeed = validOrDefaultMaxSpeed(maxSpeed);
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
    private static String validOrDefaultModel(String model) {
        if (model == null || model.isBlank() || model.isBlank()) {
            return "default";
        } else {
            return model;
        }
    }

    private static String validOrDefaultBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            return  "default";
        } else {
            return brand;
        }
    }

    private static int validOrDefaultYearOfRelease  (int yearOfRelease) {
        if (yearOfRelease == 0 || yearOfRelease < 0) {
            return 2000;
        } else {
            return yearOfRelease;
        }
    }
    private static String validOrDefaultCountry(String country) {
        if (country == null || country.isEmpty() || country.isBlank()) {
            return  "default";
        } else {
            return country;
        }
    }

    private static String validOrDefaultColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            return "белый";
        } else {
            return color;
        }
    }

    private static int validOrDefaultMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            return maxSpeed;
        } else {
            return 90;
        }
    }
}
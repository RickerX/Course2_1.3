package Transport;

public class Train extends Transport {
    private double thePriceOfTheTrip;
    private String travelTime;
    private String nameOfTheDepartureStation;
    private String finalStop;
    private int numberOfWagons;

    public Train(String brand, String model, int yearOfRelease, String country, String color, int maxSpeed, double thePriceOfTheTrip, String travelTime, String nameOfTheDepartureStation, String finalStop, int numberOfWagons) {
        super(brand, model, yearOfRelease, country, color, maxSpeed);
        if (thePriceOfTheTrip >= 1) {
            this.thePriceOfTheTrip = thePriceOfTheTrip;
        } else {
            this.thePriceOfTheTrip = 500;
        }
        this.travelTime = travelTime;
        if (travelTime != null || !travelTime.isEmpty() || !travelTime.isBlank()) {
            this.travelTime = travelTime;
        } else {
            this.travelTime = "время поездки не указано";
        }
        this.nameOfTheDepartureStation = nameOfTheDepartureStation;
        this.finalStop = finalStop;
        this.numberOfWagons = numberOfWagons;
    }

    public double getThePriceOfTheTrip() {
        return thePriceOfTheTrip;
    }

    public void setThePriceOfTheTrip(double thePriceOfTheTrip) {
        this.thePriceOfTheTrip = thePriceOfTheTrip;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime() {
        this.travelTime = travelTime;
    }

    public String getNameOfTheDepartureStation() {
        return nameOfTheDepartureStation;
    }

    public void setNameOfTheDepartureStation(String nameOfTheDepartureStation) {
        this.nameOfTheDepartureStation = nameOfTheDepartureStation;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = finalStop;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    @Override
    public void refill() {
        System.out.println(" нужно заправлять дизелем ");
    }
}

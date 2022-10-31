package Transport;

import java.time.LocalDate;

public class Car extends Transport {
    private double engineVolume;
    public String transmission;
    public String bodyType;
    public String registrationNumber;
    public int numberOfSeats;
    public boolean tires;
    private Key key;
    private Insurance insurance;

    public Car(String brand,String model,int yearOfRelease,String country,String color,double engineVolume,String transmission,String bodyType,String registrationNumber,int numberOfSeats,boolean tires, Key key, Insurance insurance,int maxSpeed) {
        super(brand,model,yearOfRelease,country,color,maxSpeed);
        this.engineVolume = validOrDefaultEngineVolume(engineVolume);
        this.transmission = validOrDefaultTransmission(transmission);
        this.bodyType = validOrDefaultBodyType(bodyType);
        this.registrationNumber = validOrDefaultRegistrationNumber(registrationNumber);
        this.numberOfSeats = validOrDefaultNumberOfSeats(numberOfSeats);
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
        this.tires = true;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public boolean isTires() {
        return tires;
    }

    public void setTires(boolean tires) {
        this.tires = tires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public boolean changeNumber () {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || (!Character.isDigit(chars[2]) || (!Character.isDigit(chars[3]) || (!Character.isDigit(chars[6]) || (!Character.isDigit(chars[7]) || (!Character.isDigit(chars[8]))))))) {

            return false;
        }
        return true;
    }
    public void setSeasonTires() {
        tires = !tires;
    }

    @Override
    public void refill() {
        System.out.println("можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар");
    }

    public static class Key {
        private final boolean remoteRunEngine;
        private final boolean withoutKey;

        public Key(boolean remoteRunEngine, boolean withoutKey) {
            this.remoteRunEngine = remoteRunEngine;
            this.withoutKey = withoutKey;
        }public Key() {
            this(false, false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isWithoutKey() {
            return withoutKey;
        }
    }

    public static class Insurance {
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }
        public Insurance() {
            this(null,20_000,null);
        }


        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку.");

            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }

    private static double validOrDefaultEngineVolume(double engineVolume) {
        if (engineVolume == 0 || engineVolume < 0) {
            return 1.5;
        } else {
            return engineVolume;
        }
    }

    private static String validOrDefaultTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            return  "Коробка передач не опознана";
        } else {
            return transmission;
        }
    }
    private static String validOrDefaultBodyType(String bodyType) {
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            return  "кузов не опознан";
        } else {
            return bodyType;
        }
    }
    private static String validOrDefaultRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            return  "номер не опознан";
        } else {
            return registrationNumber;
        }
    }
    private static int validOrDefaultNumberOfSeats(int numberOfSeats) {
        if (numberOfSeats == 0 || numberOfSeats < 0) {
            return 4;
        } else {
            return numberOfSeats;
        }
    }

}
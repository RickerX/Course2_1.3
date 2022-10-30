import Animal.Amphibians;
import Animal.Animals;
import Animal.FlyOrNotFly.Flying;
import Animal.FlyOrNotFly.NotFlying;
import Animal.Mammal.Herbivores;
import Animal.Mammal.Predators;
import Animal.Mammals;
import Transport.Bus;
import Transport.Car;
import Transport.Train;

public class Main {
    public static void separation() {
        System.out.println("==============================");
    }
    public static void main(String[] args) {
        Car lada = new Car(" ", " ", 0, "", "желтого", 0, "механика", "универсал", "а000аа750", 4,true,null,null,150);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черный", 3.0, "робот", "седан", "о000оо77", 4, false,null,null,180);
        Car bmw = new Car("BMW", "Z8", 2021, "Гремании", "черный", 3.0, "робот", "кабриолет", "в999вв198", 2, true,null,null,90);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южной Корее", "красный", 2.4, "автомат", "кроссовер", "л888лл50", 4, true,null,null,100);
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южной Корее", "оранжевый", 1.6, "автомат", "седан", "р666рр997", 4, false,null,null,200);
        printInfoCar(lada);
        lada.refill();
        printInfoCar(audi);
        audi.refill();
        printInfoCar(bmw);
        bmw.refill();
        printInfoCar(kia);
        kia.refill();
        printInfoCar(hyundai);
        hyundai.refill();
        Train lastochka = new Train("Ласточка", "модель B-901", 2011, "Россия", "", 301, 3500, "", "Белорусский вокзал", "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "модель D-125", 2019, "Россия", "", 270, 1700, "", "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        separation();
        printInfoTrain(lastochka);
        lastochka.refill();
        printInfoTrain(leningrad);
        leningrad.refill();
        Bus volvoBus = new Bus("Вольво", "А1", 2021, "Швеция", "белый", 90);
        Bus mersedesBus = new Bus("Мерседес", "А2", 2020, "Германия", "черный", 100);
        Bus scaniaBus = new Bus("Скания", "А3", 2019, "Дания", "синий", 120);
        separation();
        printInfoBus(volvoBus);
        volvoBus.refill();
        printInfoBus(scaniaBus);
        scaniaBus.refill();
        printInfoBus(mersedesBus);
        mersedesBus.refill();
        separation();
        Herbivores gazelle = new Herbivores("Газель", 2,"Африка",20,"трава");
        Herbivores giraffe = new Herbivores("Жираф", 5,"Африка",10,"листья");
        Herbivores horse = new Herbivores("Лошадь", 3,"Россия",30,"яблоки");
        Predators hyena = new Predators("Гиена", 10, "Африка", 50, "падаль");
        Predators tiger = new Predators("Тигр", 15, "Россия", 70, "кролики");
        Predators bear = new Predators("Медведь", 20, "Америка", 60, "ягоды");
        Amphibians frog = new Amphibians("Лягушка", 1, "по всей земле");
        Amphibians alreadyFreshwater = new Amphibians("Уж пресноводный", 2, "Россия");
        NotFlying peacock = new NotFlying("Павлин", 3, "Китай", "на лапах");
        NotFlying penguin = new NotFlying("Пингвин", 5, "Арктика", "на лапах или на животе");
        NotFlying dodoBird = new NotFlying("Павлин", 3, "Бразилия", "на лапах");
        Flying seagull = new Flying("Чайка", 2, "Россия", "полет и хотьба");
        Flying albatross = new Flying("Альбатросс", 5, "Америка", "полет и хотьба");
        Flying falcon = new Flying("Сокол", 8, "Россия", "полет и хотьба");
        printInfoHerbivores(gazelle);
        printInfoHerbivores(giraffe);
        printInfoHerbivores(horse);
        separation();
        printInfoPredators(hyena);
        printInfoPredators(tiger);
        printInfoPredators(bear);
        separation();
        printInfoAmphibians(frog);
        printInfoAmphibians(alreadyFreshwater);
        separation();
        printInfoNotFlying(peacock);
        printInfoNotFlying(penguin);
        printInfoNotFlying(dodoBird);
        separation();
        printInfoFlying(seagull);
        printInfoFlying(albatross);
        printInfoFlying(falcon);
        separation();




    }
    private static void printInfoCar(Car car) {
        System.out.println(" Марка: " + car.getBrand() + " модель: " + car.getModel() + " год выпуска: " + car.getYearOfRelease() + " страна: " + car.getCountry() + " цвет: " + car.getColor() + " объем двигателя: " + car.getEngineVolume() + " трансмиссия: " + car.transmission + " кузов: " + car.bodyType + " номер: " + car.changeNumber() + " количество мест: " + car.numberOfSeats + " резина: " + (car.isTires() ? "летняя" : "зимняя") + " резина" + ", " + (car.getKey().isWithoutKey() ? "без ключа" : "с ключем") + " , " + (car.getKey().isRemoteRunEngine() ? "удаленный запуск" : "локальный запуск") + " , номер страховки: " + car.getInsurance().getNumber() + " максимальная скорость: " + car.getMaxSpeed());
    }
    private static void printInfoTrain(Train train) {
        System.out.println("Поезд " + train.getBrand() + " модель: " + train.getModel() + " год выпуска: " + train.getYearOfRelease() + " страна: " + train.getCountry() + " скорость: " + train.getMaxSpeed() + " цена билета: " + train.getThePriceOfTheTrip() + " станция отбывания: " + train.getNameOfTheDepartureStation() + " станция прибытия: " + train.getFinalStop() + " количество вагонов: " + train.getNumberOfWagons());
    }
    private static void printInfoBus(Bus bus) {
        System.out.println(" Марка: " + bus.getBrand() + " модель: " + bus.getModel() + " год выпуска: " + bus.getYearOfRelease() + " страна: " + bus.getCountry() + " цвет: " + bus.getColor() + " максимальная скорость: " + bus.getMaxSpeed());
    }
    private static void printInfoHerbivores(Herbivores herbivores) {
        System.out.println("Животное: " + herbivores.getName() + " возраст: " + herbivores.getAge() + " место обитания: " + herbivores.getWednesdayOfLife() + " скорость передвиженя: " + herbivores.getMovementSpeed() + " тип пищи: " + herbivores.getTypeOfFood());
    }
    private static void printInfoPredators(Predators predators) {
        System.out.println("Животное: " + predators.getName() + " возраст: " + predators.getAge() + " место обитания: " + predators.getWednesdayOfLife() + " скорость передвиженя: " + predators.getMovementSpeed() + " тип пищи: " + predators.getTypeOfFood());
    }
    private static void printInfoAmphibians(Amphibians amphibians) {
        System.out.println("Животное: " + amphibians.getName() + " возраст: " + amphibians.getAge() + " место обитания: " + amphibians.getWednesdayOfLife());
    }
    private static void printInfoNotFlying(NotFlying notFlying) {
        System.out.println("Животное: " + notFlying.getName() + " возраст: " + notFlying.getAge() + " место обитания: " + notFlying.getWednesdayOfLife() + " тип передвижения: " + notFlying.getTypeOfMovement());
    }
    private static void printInfoFlying(Flying flying) {
        System.out.println("Животное: " + flying.getName() + " возраст: " + flying.getAge() + " место обитания: " + flying.getWednesdayOfLife() + " тип передвижения: " + flying.getTypeOfMovement());
    }
}
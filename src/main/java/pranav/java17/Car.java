package pranav.java17;

public final class Car extends Vehicle {
    Long kilometers;
    Long year;

    public Car(String code, String engineType, Long kilometers, Long year) {
        super(code, engineType);
        this.kilometers = kilometers;
        this.year = year;
    }

}

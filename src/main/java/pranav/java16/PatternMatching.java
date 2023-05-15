package pranav.java16;

import java.util.Calendar;

public class PatternMatching {

    public static void main(String[] args) {
        Car car = new Car("Kia", "Gas", 10000L, 2021L);
        Bicycle bicycle =
                new Bicycle("Greyp", "Electricity", "Mountain", 21L);

        System.out.println("Car:" + price(car));
        System.out.println("Bycicle: " + price(bicycle));
    }

    public static double price(Vehicle v) {
        if (v instanceof Car c) {
            return 10000 - c.kilometers * 0.01 -
                    (Calendar.getInstance().get(Calendar.YEAR) -
                            c.year) * 100;
        } else if (v instanceof Bicycle b) {
            return 1000 + b.wheelSize * 10;
        } else throw new IllegalArgumentException();
    }

}

package pranav.java17;

//If you don’t want to allow any other extensions you need to use the final keyword.
//On the other hand, you may open the class for extensions. In that case, you should use the non-sealed modifier
public final class Bicycle extends Vehicle {
    String type;
    Long wheelSize;

    public Bicycle(String code, String engineType, String type, Long wheelSize) {
        super(code, engineType);
        this.type = type;
        this.wheelSize = wheelSize;
    }
}

package pranav.java21;

public class SwitchPatternMatch {

    //Below is a Java pattern matching for switch using the new when as the guarded pattern.
    //P.S The old && was replaced with when in the guarded pattern.
    public static void main(String[] args) {

        testJava19("mkyong");
        testJava19("mkyongmkyong");
    }

    // new guarded pattern with when
    static void testJava19(Object o) {
        switch (o) {
            case null -> throw new RuntimeException("data is null");
            case String s
                    when s.length() > 10 ->
                    System.out.println("String's length longer than 10!");
            case String s ->
                    System.out.println("String's length is " + s.length());
            default -> {}
        }
    }
}

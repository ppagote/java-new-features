package pranav.java21;

public class RecordPattern {
    record Point(int x, int y) {
    }

    record Total(Point p1, Point p2) {
    }

    static void printSum(Object o) {
        // record nested pattern
        if (o instanceof Total(Point(int x,int y),Point(int x2,int y2))) {
            System.out.println(x + y + x2 + y2);
        }
    }

    static void printSumNew(Object o) {
        if (o instanceof Point(int x,int y)) {  // record pattern
            System.out.println(x + y);
        }
    }

    public static void main(String[] args) {
        printSumNew(new Point(10, 20)); // output 30

        printSum(new Total(new Point(10, 5), new Point(2, 3)));
    }
}

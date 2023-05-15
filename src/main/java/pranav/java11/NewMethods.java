package pranav.java11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NewMethods {

    public static void main(String[] args) throws IOException {
        newStringMethod();
        newFileMethod();
        collectionToArray();
        notPredicateMethod();
    }

    private static void newStringMethod() {
        //isBlank, lines, strip, stripLeading, stripTrailing, and repeat.
        String multilineString = "Baeldung helps \n \n developers \n explore Java.";
        List<String> lines = multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .toList();

        System.out.println("lines = " + lines);
        System.out.println("isBlank = " + "   ".isBlank());
        System.out.println("stripLeading = " + "   Pranav".stripLeading());
        System.out.println("stripTrailing = " + "Pranav   ".stripTrailing());
        System.out.println("repeat = " + "Pranav ".repeat(2));
    }

    private static void newFileMethod() throws IOException {
        File file = new File("C:\\Users\\dhana\\Downloads\\gs-multi-module-main\\gs-multi-module-main\\java-new-features\\src\\main\\resources");
        Path filePath = Files.writeString(Files.createTempFile(file.toPath(), "demo", ".txt"), "Sample text");
        String fileContent = Files.readString(filePath);
        System.out.println("fileContent = " + fileContent);
        new File(filePath.toUri()).deleteOnExit();
    }

    private static void collectionToArray() {
        List<String> sampleList = Arrays.asList("Java", "Kotlin");
        String[] sampleArray = sampleList.toArray(String[]::new);
        System.out.println("sampleArray = " + sampleArray.length);
    }

    private static void notPredicateMethod(){
        List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");
        List<String> withoutBlanks = sampleList.stream()
                .filter(Predicate.not(String::isBlank))
                .toList();
        System.out.println("withoutBlanks = " + withoutBlanks);
    }
}

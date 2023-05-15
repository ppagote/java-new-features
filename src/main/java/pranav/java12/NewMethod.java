package pranav.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewMethod {

    public static void main(String[] args) throws IOException {
        newStringMethod();
        newFileMismatchMethod();
    }

    private static void newFileMismatchMethod() throws IOException {
        Path filePath1 = Files.createTempFile("file1", ".txt");
        Path filePath2 = Files.createTempFile("file2", ".txt");
        Files.writeString(filePath1, "Java 12 Article");
        Files.writeString(filePath2, "Java 12 Article");

        long mismatch = Files.mismatch(filePath1, filePath2);
        System.out.println("mismatch = " + mismatch);


        Path filePath3 = Files.createTempFile("file3", ".txt");
        Path filePath4 = Files.createTempFile("file4", ".txt");
        Files.writeString(filePath3, "Java 12 Article");
        Files.writeString(filePath4, "Java 12 Tutorial");

        long mismatch1 = Files.mismatch(filePath3, filePath4);
        System.out.println("mismatch = " + mismatch1);
    }

    private static void newStringMethod() {
        String text = "Hello Baeldung!\nThis is Java 12 article.";

        text = text.indent(4);
        System.out.println(text);

        text = text.indent(-10);
        System.out.println(text);


        String text1 = "Baeldung";
        String transformed = text1.transform(value ->
                new StringBuilder(value).reverse().toString()
        );
        System.out.println("transformed = " + transformed);
    }
    
    
}

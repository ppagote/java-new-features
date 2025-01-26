package pranav.java21;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

//https://www.oracle.com/java/technologies/javase/21-relnote-issues.html
public class VirtualThreads {

    public static void main(String[] args) {
        Instant now = Instant.now();
        // finish within 1 second
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 10_000).forEach(i -> executor.submit(() -> {
                Thread.sleep(Duration.ofSeconds(1));
                return i;
            }));
        }
        Instant now1 = Instant.now();
        System.out.println("time taken for virtual threads : " + Duration.between(now, now1).getSeconds());

        // 10_000/20 = 500seconds, it takes 8 minutes and 33 seconds to finish it
        try (var executor = Executors.newFixedThreadPool(20)) {
            IntStream.range(0, 10_000).forEach(i -> executor.submit(() -> {
                Thread.sleep(Duration.ofSeconds(1));
                return i;
            }));
        }

        Instant now2 = Instant.now();
        System.out.println("time taken for threads : " + Duration.between(now2, now1).getSeconds());

    }
}

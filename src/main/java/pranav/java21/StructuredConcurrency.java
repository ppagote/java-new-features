package pranav.java21;

import java.time.Duration;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.StructuredTaskScope;
import java.util.concurrent.StructuredTaskScope.Subtask;


public class StructuredConcurrency {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        StructuredConcurrency obj = new StructuredConcurrency();
        System.out.println(obj.handleStructureAPI());
    }

    private Response handleStructureAPI() throws ExecutionException, InterruptedException {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            Subtask<String> user = scope.fork(this::findUser);
            Subtask<Integer> order = scope.fork(this::fetchOrder);

            scope.join();           // Join both forks
            scope.throwIfFailed();  // ... and propagate errors

            // Here, both forks have succeeded, so compose their results
            return new Response(user.get(), order.get());
        }
    }


    private String findUser() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(1));
        return "mkyong";
    }

    private Integer fetchOrder() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(1));
        return 1;
    }

    record Response(String x, int y) {
    }
}

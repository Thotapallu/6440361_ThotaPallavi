import java.util.concurrent.*;
import java.util.*;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // 3 threads
        List<Callable<String>> tasks = new ArrayList<>();

        // Create 3 tasks
        tasks.add(() -> {
            Thread.sleep(1000); // simulate delay
            return "Task 1 completed";
        });

        tasks.add(() -> {
            Thread.sleep(2000);
            return "Task 2 completed";
        });

        tasks.add(() -> {
            Thread.sleep(500);
            return "Task 3 completed";
        });

        try {
            // Submit all tasks and get a list of Futures
            List<Future<String>> results = executor.invokeAll(tasks);

            for (Future<String> future : results) {
                System.out.println(future.get()); // get() blocks until result is ready
            }
        } catch (Exception e) {
            System.out.println("Error executing tasks: " + e);
        } finally {
            executor.shutdown();
        }
    }
}

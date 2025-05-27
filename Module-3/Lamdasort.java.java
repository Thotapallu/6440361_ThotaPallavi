import java.util.ArrayList;
import java.util.Collections;

public class LambdaSort {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Zara");
        names.add("Mike");
        names.add("Anna");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

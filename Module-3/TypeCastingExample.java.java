public class TypeCastingExample {
    public static void main(String[] args) {
        double d = 9.78;
        int i = (int) d; // explicit casting

        int j = 10;
        double d2 = j; // implicit casting

        System.out.println("Double to int: " + i);
        System.out.println("Int to double: " + d2);
    }
}

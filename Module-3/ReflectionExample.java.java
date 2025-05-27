import java.lang.reflect.*;

class Demo {
    public void sayHi() {
        System.out.println("Hi via Reflection");
    }
}

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Demo");
        Object obj = clazz.getDeclaredConstructor().newInstance();

        Method method = clazz.getDeclaredMethod("sayHi");
        method.invoke(obj);
    }
}

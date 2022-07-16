
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<Reflection> reflectionClass = Reflection.class;

        System.out.println(reflectionClass);

        Class<? super Reflection> superclass = reflectionClass.getSuperclass();
        System.out.println(superclass);

        Class<?>[] interfaces = reflectionClass.getInterfaces();
        Arrays.stream(interfaces)
                .forEach(System.out::println);

       Constructor<Reflection> declaredConstructor = reflectionClass.getDeclaredConstructor();


        Reflection reflection = declaredConstructor.newInstance();

        System.out.println(reflection);


    }
}

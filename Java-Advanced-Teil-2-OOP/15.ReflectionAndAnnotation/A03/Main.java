import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Class<Reflection> clazz = Reflection.class;

        Arrays.stream(clazz.getDeclaredFields()).filter(f -> !Modifier.isPrivate(f.getModifiers()))
                .sorted(Comparator.comparing(Field::getName))
                .forEach(a -> System.out.println(a.getName() + " must be private!"));
        Method[] declaredMethods = Arrays.stream(clazz.getDeclaredMethods())
                        .filter(a -> !a.getName().equals("toString"))
                                .toArray(Method[]::new);

        Arrays.stream(declaredMethods)
                .filter(a -> a.getReturnType() != void.class)
                .filter(a -> !Modifier.isPublic(a.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(a -> System.out.println(a.getName() + " have to be public!"));

        Arrays.stream(declaredMethods)
                .filter(a -> a.getReturnType() == void.class)
                .filter(a -> !Modifier.isPrivate(a.getModifiers()))

                .sorted(Comparator.comparing(Method::getName))
                .forEach(a -> System.out.println(a.getName() + " have to be private!"));
    }
}

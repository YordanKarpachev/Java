package T15.ReflectionAndAnnotation.A05;

import java.lang.annotation.Retention;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Class<Reflection> clazz = Reflection.class;
        Arrays.stream(clazz.getDeclaredMethods()).filter(a -> a.getAnnotation(Author.class) != null)
                .map(a -> a.getAnnotation(Author.class))
                .forEach(a -> System.out.println(a.name()));
    }
}

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class Main {


public static class comparatorMethod implements Comparator<Method>{

    @Override
    public int compare(Method o1, Method o2) {
        boolean getterO1 = o1.getName().startsWith("get");
        boolean gettro2 = o2.getName().startsWith("get");

        if(getterO1 && gettro2){
            return  o1.getName().compareTo(o2.getName());
        }
        boolean setterO1 = o1.getName().startsWith("set");
        boolean settero2 = o2.getName().startsWith("set");

        if(setterO1 && settero2){

            return o1.getName().compareTo(o2.getName());
        }
        return Boolean.compare(setterO1, settero2);

    }

    public static void print(Method method) {
        String output = method.getName().startsWith("get") ?
                String.format("%s will return class %s",method.getName(), method.getReturnType().getSimpleName()) :
                String.format("%s and will set field of class %s", method.getName(), method.getParameterTypes()[0].getSimpleName() );
        System.out.println(output);
    }
}


    public static void main(String[] args) {


        Class<Reflection> reflection = Reflection.class;

        Method[] declaredMethods = reflection.getDeclaredMethods();

        Arrays.stream(declaredMethods).sorted(new comparatorMethod())
                .filter(a -> !a.getName().equals("toString"))
                .forEach(comparatorMethod::print);
    }
}

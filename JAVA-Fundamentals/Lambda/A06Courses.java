package AssociaciveArrExerice;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;

public class A06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> kurses = new LinkedHashMap<>();

        String[] input = scanner.nextLine().split(" : ");
        while (!input[0].equals("end")){

            List<String > person = new ArrayList<>();



            if(kurses.containsKey(input[0])){
                person.addAll(kurses.get(input[0]));
                person.add(input[1]);
                kurses.put(input[0],person );

            }else {
                person.add(input[1]);
                kurses.put(input[0],person );
            }









         input = scanner.nextLine().split(" : ");
        }


        for (Map.Entry<String , List<String>> entry : kurses.entrySet()){

            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            entry.getValue().forEach(a -> System.out.printf("-- %s%n", a));
        }
    }
}

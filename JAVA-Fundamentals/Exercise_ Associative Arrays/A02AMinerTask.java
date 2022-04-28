package AssociaciveArrExerice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class A02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resource = scanner.nextLine(); //.toLowerCase();

        Map<String, Integer> data = new LinkedHashMap<>();

        while (!resource.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());

            data.putIfAbsent(resource, 0);
            data.put(resource, data.get(resource) + quantity);




          resource = scanner.nextLine();//.toLowerCase();
        }

       data.forEach((k, v) -> System.out.println(k +" -> "+ v) );
    }
}

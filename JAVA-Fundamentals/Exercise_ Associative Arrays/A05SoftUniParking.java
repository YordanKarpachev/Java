package AssociaciveArrExerice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class A05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String > register = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] data = scanner.nextLine().split(" ");

            switch (data[0]){
                case "register":
                    if(register.containsKey(data[1])){
                        System.out.printf("ERROR: already registered with plate number %s%n", data[2]);
                    } else {
                        register.put(data[1],data[2] );
                        System.out.printf("%s registered %s successfully%n",data[1],data[2] );
                    }

                    break;
                case "unregister":
                    if(register.containsKey(data[1])){
                        System.out.printf("%s unregistered successfully%n", data[1]);
                          register.remove(data[1]);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", data[1]);
                    }

                    break;
            }


        }

        register.forEach((k,v) -> System.out.printf("%s => %s%n", k, v));


    }
}

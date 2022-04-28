package AssociaciveArrExerice;

import java.util.*;

public class A08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, List<String>> companyDaten = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String[] data = input.split(" -> ");

            companyDaten.putIfAbsent(data[0], new ArrayList<>());
            if (!companyDaten.get(data[0]).contains(data[1])) {
                companyDaten.get(data[0]).add(data[1]);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companyDaten.entrySet()) {

            System.out.printf("%s%n", entry.getKey());
           entry.getValue().forEach(a -> System.out.printf("-- %s%n", a));
        }

    }
}


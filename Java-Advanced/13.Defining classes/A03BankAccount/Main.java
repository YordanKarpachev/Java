package DefiningClasses.A03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        Map<Integer, BankAccount> bankAccountMap = new HashMap<>();
        while (!input[0].equals("End")) {




            switch (input[0]) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    int bankAccountId = bankAccount.getId();
                    bankAccountMap.put(bankAccountId, bankAccount);
                    System.out.printf("Account ID%d created%n", bankAccountId);

                    break;
                case "Deposit":
                    //    • Deposit {Id} {Amount}
                    int id = Integer.parseInt(input[1]);
                 //   double amount = Double.parseDouble(input[2]);
                  int  amount = Integer.parseInt(input[2]);
                    if (bankAccountMap.containsKey(id)) {
                        bankAccountMap.get(id).deposit(amount);
                        System.out.printf("Deposited %d to ID%d%n", amount, id);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                    //    • SetInterest {Interest}
                    double intereset = Double.parseDouble(input[1]);
                    BankAccount.setInteresetRate(intereset);
                    break;
                case "GetInterest":
                    //    • GetInterest {ID} {Years}
                    int idd = Integer.parseInt(input[1]);
                    int year =  Integer.parseInt(input[2]);
                    if (bankAccountMap.containsKey(idd)){
                        double interesetRate = bankAccountMap.get(idd).getInteresetRate(year);
                        System.out.printf("%.2f%n", interesetRate);
                    } else {
                        System.out.println("Account does not exist");
                    }

                    break;


            }


            input = scanner.nextLine().split(" ");
        }
    }
}

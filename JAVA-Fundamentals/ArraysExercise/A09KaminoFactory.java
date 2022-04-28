package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class A09KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int[] bestarr = new int[n];
        int indexbesarr = 0;
        int dnaCounter = 0;
        int dnaBestCounter = 0;

        int counter = 0;
        while (!input.equals("Clone them!")) {
            dnaCounter++;

            String[] data = input.split("!+");
            int[] arrinteger = new int[n];

            for (int i = 0; i < data.length; i++) {

                arrinteger[i] = Integer.parseInt(data[i]);

            }


            int aktuellecounter = 0;
            int indexaktuellearr = 0;


            for (int i = 0; i < arrinteger.length - 1; i++) {
                int currentCounter = 0;
                for (int j = i; j < arrinteger.length; j++) {

                    currentCounter++;


                    if (currentCounter > indexbesarr) {
                    indexbesarr = currentCounter;
                    dnaBestCounter = i;
                    }
                    }

                 /*      aktuellecounter++;
                   //     indexaktuellearr = i;
                   //     if (counter < aktuellecounter) {
                  //          indexbesarr = i;
                   //         counter = aktuellecounter;

                    //        bestarr = arrinteger;
                  //          dnaBestCounter = dnaCounter;
                        }
                    }
                }
                // }
            }

            if (aktuellecounter == counter && indexaktuellearr != indexbesarr) {
                if (indexaktuellearr < indexbesarr) {

                    bestarr = arrinteger;
                    dnaBestCounter = dnaCounter;
                } else if (indexaktuellearr == indexbesarr) {
                    int sum1 = 0;
                    int sum2 = 0;
                    for (int i : bestarr) {
                        sum1 += i;
                    }
                    for (int b : arrinteger) {
                        sum2 += b;
                    }
                    if (sum1 < sum2) {
                        bestarr = arrinteger;
                        dnaBestCounter = dnaCounter;
                    } */


                }


            }


            input = scanner.nextLine();
        }
     //   int sumbestarr = 0;
     //   for (int l : bestarr) {
     //       sumbestarr += l;
        }

    //    System.out.printf("Best DNA sample %d with sum: %d.%n", dnaBestCounter, sumbestarr);
    //    Arrays.stream(bestarr).forEach(w -> System.out.print(w + " "));

//    }
//}

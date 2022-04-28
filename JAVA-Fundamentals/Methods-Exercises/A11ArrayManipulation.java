package MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class A11ArrayManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e))
                .toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] inputCommand = input.split(" ");
            String command = inputCommand[0];

            switch (command) {
                case "exchange":
                    int index = Integer.parseInt(inputCommand[1]);
                    if (index < 0 || index > inputArray.length ) {
                        System.out.println("Invalid index");
                    } else {
                        exchangeArray(inputArray, index);
                        for (int i = 0; i < inputArray.length; i++) {

                        }
                    }
                    break;


                case "max":
                    String evenOrOdd = inputCommand[1];

                    if (evenOrOdd.equals("odd")) {
                        int maxOdd = maxOdd(inputArray);
                        if (maxOdd != -1) {
                            System.out.println(maxOdd);
                        } else {
                            System.out.println("No matches");
                        }

                    } else if (evenOrOdd.equals("even")) {
                        int maxEven = maxEven(inputArray);
                        if (maxEven != -1) {
                            System.out.println(maxEven);
                        } else {
                            System.out.println("No matches");
                        }
                    }
                    break;


                case "min":
                    String evenOrOddmin = inputCommand[1];

                    if (evenOrOddmin.equals("odd")) {
                        int maxOdd = minOdd(inputArray);
                        if (maxOdd != -1) {
                            System.out.println(maxOdd);
                        } else {
                            System.out.println("No matches");
                        }

                    } else if (evenOrOddmin.equals("even")) {
                        int maxEven = minEven(inputArray);
                        if (maxEven != -1) {
                            System.out.println(maxEven);
                        } else {
                            System.out.println("No matches");
                        }
                    }
                    break;


                case "first":
                    int count = Integer.parseInt(inputCommand[1]);
                    String evenorodd = inputCommand[2];
                    if (evenorodd.equals("even")) {
                        if (count < 0 || count > inputArray.length - 1) {
                            System.out.println("Invalid count");
                        } else {

                            printFirstEven(inputArray, count);
                        }

                    } else if (evenorodd.equals("odd")) {
                        if (count < 0 || count > inputArray.length - 1) {
                            System.out.println("Invalid count");
                        } else {

                            printFirstOdd(inputArray, count);
                        }

                    }
                    break;


                case "last":
                    int countlast = Integer.parseInt(inputCommand[1]);
                    String evenoroddd = inputCommand[2];
                    if (evenoroddd.equals("even")) {
                        lastCountEven(inputArray, countlast);

                    } else if (evenoroddd.equals("odd")) {
                        lasCountOdd(inputArray, countlast);

                    }
                    break;


            }


            input = scanner.nextLine();
        }

        for (int j = 0; j < inputArray.length; j++) {
            if (j == 0) {
                System.out.print("[" + inputArray[j] + ", ");
                continue;
            }
            if (j == inputArray.length - 1) {
                System.out.print(inputArray[j] + "]");
                break;
            }
            System.out.print(inputArray[j] + ", ");
        }


    }


    private static void lasCountOdd(int[] inputArray, int countlast) {
        int counter = -1;
        int[] firsteven = new int[countlast];
        for (int i = inputArray.length - 1; i >= 0; i--) {

            if (inputArray[i] % 2 == 1) {
                counter++;
                firsteven[counter] = inputArray[i];
                if (counter >= countlast - 1) {
                    break;
                }
            }
        }
        if (counter == -1) {
            System.out.println("[]");
        }
        if (counter == -1) {
            System.out.println("[]");
        }
        if (counter == 0) {
            System.out.println("[" + firsteven[0] + "]");
        } else {
            for (int j = 0; j <= counter; j++) {
                if (j == 0) {
                    System.out.print("[" + firsteven[j] + ", ");
                    continue;
                }
                if (j == counter) {
                    System.out.print(firsteven[j] + "]");
                    break;
                }
                System.out.print(firsteven[j] + ", ");
            }
            System.out.println();
        }


    }

    private static void lastCountEven(int[] inputArray, int countlast) {
        int counter = -1;
        int[] firsteven = new int[countlast];
        for (int i = inputArray.length - 1; i >= 0; i--) {

            if (inputArray[i] % 2 == 0) {
                counter++;
                firsteven[counter] = inputArray[i];
                if (counter >= countlast - 1) {
                    break;
                }
            }
        }
        if (counter == -1) {
            System.out.println("[]");
        }
       else if (counter == 0) {
            System.out.println("[" + firsteven[0] + "]");
        } else {
            for (int j = 0; j < firsteven.length; j++) {
                if (j == 0) {
                    System.out.print("[" + firsteven[j] + ", ");
                    continue;
                }
                if (j == firsteven.length - 1) {
                    System.out.print(firsteven[j] + "]");
                    break;
                }
                System.out.print(firsteven[j] + ", ");
            }
            System.out.println();
        }
    }


    private static void printFirstOdd(int[] inputArray, int count) {
        int counter = -1;
        int[] firsteven = new int[count];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 1) {
                counter++;
                firsteven[counter] = inputArray[i];
                if (counter >= count - 1) {
                    break;
                }
            }
        }
        if (counter == -1) {
            System.out.println("[]");
        }
        if (counter == -1) {
            System.out.println("[]");
        }
        if (counter == 0) {
            System.out.println("[" + firsteven[0] + "]");
        } else {
            for (int i = 0; i < firsteven.length; i++) {
                if (i == 0) {
                    System.out.print("[" + firsteven[i] + ", ");
                    continue;
                }
                if (i == firsteven.length - 1) {
                    System.out.print(firsteven[i] + "]");
                    break;
                }
                System.out.print(firsteven[i] + ", ");
            }
            System.out.println();
        }


    }

    private static void printFirstEven(int[] inputArray, int count) {
        int counter = -1;
        int[] firsteven = new int[count];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 0) {
                counter++;
                firsteven[counter] = inputArray[i];
                if (counter >= count - 1) {
                    break;
                }
            }
        }
        if (counter == -1) {
            System.out.println("[]");
        }
        if (counter == -1) {
            System.out.println("[]");
        }
        if (counter == 0) {
            System.out.println("[" + firsteven[0] + "]");
        } else {
            for (int i = 0; i < firsteven.length; i++) {
                if (i == 0) {
                    System.out.print("[" + firsteven[i] + ", ");
                    continue;
                }
                if (i == firsteven.length - 1) {
                    System.out.print(firsteven[i] + "]");
                    break;
                }
                System.out.print(firsteven[i] + ", ");
            }
            System.out.println();
        }

    }

    private static int minEven(int[] inputArray) {
        int index = -1;
        int aktuellezahl = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 0) {

                if (inputArray[i] <= aktuellezahl) {
                    aktuellezahl = inputArray[i];
                    index = i;
                }
            }


        }


        return index;
    }

    private static int minOdd(int[] inputArray) {
        int index = -1;
        int aktuellezahl = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 1) {

                if (inputArray[i] <= aktuellezahl) {
                    aktuellezahl = inputArray[i];
                    index = i;
                }
            }


        }


        return index;

    }


    private static int maxOdd(int[] inputArray) {
        int index = -1;
        int aktuellezahl = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 1) {

                if (inputArray[i] >= aktuellezahl) {
                    aktuellezahl = inputArray[i];
                    index = i;
                }
            }


        }


        return index;
    }

    private static int maxEven(int[] inputArray) {

        int index = -1;
        int aktuellezahl = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 0) {

                if (inputArray[i] >= aktuellezahl) {
                    aktuellezahl = inputArray[i];
                    index = i;
                }
            }


        }


        return index;


    }

    private static void exchangeArray(int[] inputArray, int index) {
        //[1, 2, 3, 4, 5] -> exchange 2 -> result: [4, 5, 1, 2, 3]
        int[] ersteTeil = new int[index + 1];
        int[] teilZwei = new int[inputArray.length - index - 1];

        for (int i = 0; i <= index; i++) {
            ersteTeil[i] = inputArray[i];

        }

        for (int i = index; i < inputArray.length - 1; i++) {

            teilZwei[i - index] = inputArray[i + 1];
        }

        for (int i = 0; i < inputArray.length; i++) {

            if (i < teilZwei.length) {
                inputArray[i] = teilZwei[i];
            } else {
                inputArray[i] = ersteTeil[i - teilZwei.length];
            }
        }

    }


}

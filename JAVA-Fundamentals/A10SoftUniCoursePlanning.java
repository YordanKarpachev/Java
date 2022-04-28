package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> kursProgram = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            String[] inputArr = input.split(":");
            String command = inputArr[0];
            String lessonTitle = inputArr[1];

            switch (command) {
                case "Add":
                    if (!kursProgram.contains(lessonTitle)) {
                        kursProgram.add(lessonTitle);
                    }

                    break;

                case "Insert":
                    int index = Integer.parseInt(inputArr[2]);
                    if (!kursProgram.contains(lessonTitle)) {
                        kursProgram.add(index, lessonTitle);
                    }


                    break;

                case "Remove":
                    kursProgram.remove(lessonTitle);
                    if (kursProgram.contains(lessonTitle + "-Exercise")) {
                        kursProgram.remove(lessonTitle + "-Exercise");
                    }
                    break;

                case "Swap":
                    String firstTitle = inputArr[1];
                    String secondTitle = inputArr[2];
                    if (kursProgram.contains(firstTitle) && kursProgram.contains(secondTitle)) {
                        int indexfirstTitle = kursProgram.indexOf(firstTitle);
                        int indexsecondTitle = kursProgram.indexOf(secondTitle);
                        kursProgram.set(indexfirstTitle, secondTitle);
                        kursProgram.set(indexsecondTitle, firstTitle);
                        if (kursProgram.contains(firstTitle + "-Exercise")) {
                            int indexofExerciseFirst = kursProgram.indexOf(firstTitle + "-Exercise");
                            kursProgram.remove(firstTitle + "-Exercise");
                            kursProgram.add(indexsecondTitle, firstTitle + "-Exercise");
                        }
                        if (kursProgram.contains(secondTitle + "-Exercise")) {
                            int indexofExerciseSecond = kursProgram.indexOf(secondTitle + "-Exercise");
                            kursProgram.remove(secondTitle + "-Exercise");
                            kursProgram.add(indexsecondTitle, secondTitle + "-Exercise");
                        }
                    }
                    break;

                //Databases-Exercise
                case "Exercise":
                    if (kursProgram.contains(lessonTitle) && !kursProgram.contains(lessonTitle + "-Exercise")) {
                        int indexTitle = kursProgram.indexOf(lessonTitle);
                        kursProgram.add(indexTitle + 1, lessonTitle + "-Exercise");
                    } else if (!kursProgram.contains(lessonTitle)) {
                        kursProgram.add(lessonTitle);
                        kursProgram.add(lessonTitle + "-Exercise");
                    }

                    break;


            }


            input = scanner.nextLine();
        }

        for (int i = 1; i <= kursProgram.size(); i++) {

            System.out.println(i + "." + kursProgram.get(i - 1));

        }
    }
}

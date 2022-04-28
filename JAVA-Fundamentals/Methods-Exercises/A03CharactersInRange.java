package MethodsExercise;

import java.util.Scanner;

public class A03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        String end = scanner.nextLine();

       charInRange(start, end);
       // System.out.println(output);
    }


    private static void charInRange (String start, String end )
    {

        if ((char)start.charAt(0) >(char) end.charAt(0))
        {
            String replace = start;
        start = end;
                 end = replace;

        }
        for (char i = (char) start.charAt(0); i < (char) end.charAt(0) - 1 ; i++) {
            System.out.printf("%c ", i + 1 );
        }
    }

}

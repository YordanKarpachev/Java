package T16ExerciseReflectionAndAnnotation.A01;

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Class<RichSoilLand> clazz = RichSoilLand.class;

		String input = scanner.nextLine();


		while (!input.equals("HARVEST")){
			switch (input){
				case "private":
					Arrays.stream(clazz.getDeclaredFields()).filter(a -> Modifier.isPrivate(a.getModifiers()))
							.forEach(a -> getPrintf(a));
					break;
				case "protected":
					Arrays.stream(clazz.getDeclaredFields()).filter(a -> Modifier.isProtected(a.getModifiers()))
							.forEach(a -> getPrintf(a));
					break;
				case "public":
					Arrays.stream(clazz.getDeclaredFields()).filter(a -> Modifier.isPublic(a.getModifiers()))
							.forEach(a -> getPrintf(a));
					break;
				case "all":
					Arrays.stream(clazz.getDeclaredFields())
							.forEach(a -> getPrintf(a));
					break;
			}




			input = scanner.nextLine();
		}

	}

	private static PrintStream getPrintf(Field a) {
		return System.out.printf("%s %s %s%n",
				Modifier.toString(a.getModifiers()), a.getType().getSimpleName(), a.getName());
	}
}

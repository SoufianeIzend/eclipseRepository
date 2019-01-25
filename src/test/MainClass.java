package test;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
	public static int result;
	public static double result1;
	public static double result2;
	public static String check;
	public static int calcul;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String s = "";
		while (!s.contentEquals("easy") && !s.contentEquals("hard")) {
			System.out.println(
					"-----------------Please choose the mode of the game between 'Easy'and 'Hard': ---------------");

			Scanner scanner = new Scanner(System.in);
			s = scanner.nextLine();

		}

		switch (s) {
		case "easy":
			System.out.println("----------------You have chosen the easy mode-------------");
			
			for (int i = 0; i < 5; i++) {

				Random r1 = new Random();
				int a = r1.nextInt((10 - 1) + 1) + 1;
				Random r2 = new Random();
				int b = r2.nextInt((10 - 1) + 1) + 1;
				Random r3 = new Random();
				int op = r3.nextInt((2 - 1) + 1) + 1;
				switch (op) {
				case 1:
					result = a + b;
					check = "+";

					break;
				case 2:
					result = a - b;
					check = "-";

					break;
				}
				long start = System.currentTimeMillis();
		        long end = start + 10000;
				
				System.out.println(a + "." + b + "=" + result);
				System.out.println("----------------Try to guess the right operator x) ----------------");
				
			
				Scanner scanner = new Scanner(System.in);
				String answer = scanner.nextLine();
			    if(start>= end) { System.out.println("you ran out of time");} 
			   if(start<= end) {
				
				if (answer.equals(check)) {
					System.out.println("Right answer :D !");
					calcul++;
				} else {
					System.out.println("Bad answer :c !");
				}
				} 
				
				
				

			}
			switch (calcul) {
			case 1:
				System.out.println("You have gotten "+ calcul +" out of 3!");
				break;
			case 2:
				System.out.println("You have gotten 2 out of 3!");
				break;
			case 3:
				System.out.println("You have gotten 3 out of 3!");
				break;
			}

			break;

		case "hard":
			System.out.println("----------------You have chosen the hard mode-------------");

			for (int i = 0; i < 3; i++) {

				Random r1 = new Random();
				int a = r1.nextInt((10 - 1) + 1) + 1;
				Random r2 = new Random();
				int b = r2.nextInt((10 - 1) + 1) + 1;
				Random r3 = new Random();
				int c = r3.nextInt((10 - 1) + 1) + 1;
				Random r4 = new Random();
				int op = r4.nextInt((4 - 1) + 1) + 1;
				Random r5 = new Random();
				int op1 = r5.nextInt((4 - 1) + 1) + 1;
				switch (op) {
				case 1:
					result1 = a + b;

					break;
				case 2:
					result1 = a - b;

					break;
				case 3:
					result1 = a * b;

					break;
				case 4:
					double d = b;

					result1 = a / d;

					break;
				}
				switch (op1) {
				case 1:
					result1 = result1 + c;

					break;
				case 2:
					result1 = result1 - c;

					break;
				case 3:
					result1 = result1 * c;

					break;
				case 4:
					double d = c;

					result1 = result1 / d;

					break;
				}
				System.out.println(a + "." + b + "." + c + "=" + result1);
				System.out
						.println("----------------Try to guess the first operator between a and b x) ----------------");
				Scanner scanner = new Scanner(System.in);
				String answer = scanner.nextLine();
				System.out.println(
						"----------------Try to guess the second operator between b and c x) ----------------");
				Scanner scanner2 = new Scanner(System.in);
				String answer2 = scanner2.nextLine();
				switch (answer) {
				case "+":
					result2 = a + b;

					break;
				case "-":
					result2 = a - b;

					break;
				case "*":
					result2 = a * b;

					break;
				case "/":
					double d = b;
					result2 = a / d;

					break;
				}
				switch (answer2) {
				case "+":
					result2 = result2 + c;

					break;
				case "-":
					result2 = result2 - c;

					break;
				case "*":
					result2 = result2 * c;

					break;
				case "/":
					double d = c;
					result2 = result2 / d;

					break;
				}
				if (result1 == result2) {
					System.out.println("Right answer :D !");
					calcul++;
				} else {
					System.out.println("Bad answer :c !");
				}

			}
			System.out.println("you have gotten "+ calcul +"/3 as a score!");

			break;

		}

	}

}

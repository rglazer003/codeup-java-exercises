package util;

import movies.Movie;
import movies.MoviesApplication;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public static String getString() {
        return scanner.nextLine();
    }

    public static boolean yesNo() {
        System.out.println("Yes or no?");
        String input = scanner.nextLine();
        return (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y"));
    }

    public static int getInt(int min, int max) {
        System.out.println("Enter a number between " + min + " and " + max);
        int input = scanner.nextInt();
        if (input > max || input < min) {
            return getInt(min, max);
        }
        return input;
    }

    public static int getInt() {
        String hold = scanner.nextLine();
        int result;
        try {
            result = Integer.valueOf(hold);
        }catch (NumberFormatException e){
            System.out.println("Not a number, please try again");
            return getInt();
        }
        return result;
    }

    public static double getDouble(double min, double max) {
        System.out.println("Enter a number between " + min + " and " + max);
        double input = scanner.nextDouble();
        if (input < min || input > max) {
            return getDouble(min, max);
        }
        return input;
    }

    public static double getDouble() {
        String hold = scanner.nextLine();
        double result;
        try{
            result = Double.valueOf(hold);
        }catch (NumberFormatException e){
            System.out.println("Not a valid number, please try again");
            return getDouble();
        }
        return result;
    }

    public static String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public static boolean yesNo(String prompt) {
        System.out.println(prompt);
        System.out.println("Yes or no?");
        String input = scanner.nextLine();
        return (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y"));
    }

    public static int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
        System.out.println("Enter a number between " + min + " and " + max);
        int input = scanner.nextInt();
        if (input > max || input < min) {
            return getInt(min, max);
        }
        return input;
    }

    public static int getInt(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public static double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        System.out.println("Enter a number between " + min + " and " + max);
        double input = scanner.nextDouble();
        if (input < min || input > max) {
            return getDouble(min, max);
        }
        return input;
    }

    public static double getDouble(String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    public static void waitForEnter() {
        scanner.nextLine();
    }

    public static int getIntMovie(int min, int max) {
        int input = scanner.nextInt();
        if (input > max || input < min) {
            System.out.println("Invalid choice, please enter a valid option");
            MoviesApplication.listOptions();
            return getIntMovie(min, max);
        }
        return input;
    }

    public static boolean yesNoSilent(String prompt){
        System.out.println(prompt);
        String input =scanner.nextLine();
        return (input.equalsIgnoreCase("yes")||input.equalsIgnoreCase("y"));
    }

    public static void main(String[] args) {
    }
}

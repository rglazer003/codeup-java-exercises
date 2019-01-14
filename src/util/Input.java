package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);
    public static String getString(){
        return scanner.nextLine();
    }
    public static boolean yesNo(){
        System.out.println("Yes or no?");
        String input = scanner.nextLine();
        return (input.equalsIgnoreCase("yes")||input.equalsIgnoreCase("y"));
    }
    public static int getInt(int min, int max){
        System.out.println("Enter a number between "+min+" and "+max);
        int input = scanner.nextInt();
        if (input>max||input<min){
            return getInt(min,max);
        }
        return input;
    }
    public static int getInt(){
        return scanner.nextInt();
    }
    public static double getDouble(double min, double max){
        System.out.println("Enter a number between "+min+" and "+max);
        double input =scanner.nextDouble();
        if (input<min||input>max){
            return getDouble(min,max);
        }
        return input;
    }
    public static double getDouble(){
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
    }
}

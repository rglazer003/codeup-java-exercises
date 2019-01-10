import java.util.Random;
import java.util.Scanner;

public class MethodsPractice {
    public static void main(String[] args) {
//        firstChar();
//        secondChar();
//        lastChar();
//        secondToLastChar();
//        System.out.println(userWantsToContinue());
//        System.out.println(test());
//        boolean even = isEven();
//        if (even){
//            System.out.println("Number is even");
//        }
//        else{
//            System.out.println("Number is odd");
//        }
        isEvenRandom();
    }

    public static void firstChar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type something.");
        String hold = scanner.nextLine();
        char result = hold.charAt(0);
        System.out.println(result);
    }
    public static void secondChar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type something.");
        String hold = scanner.nextLine();
        char result = hold.charAt(1);
        System.out.println(result);
    }
    public static void lastChar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type something.");
        String hold = scanner.nextLine();
        int length = hold.length();
        char result = hold.charAt(length-1);
        System.out.println(result);
    }
    public static void secondToLastChar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type something.");
        String hold = scanner.nextLine();
        int length = hold.length();
        char result = hold.charAt(length-2);
        System.out.println(result);
    }
    public static boolean userWantsToContinue(){
        Scanner scanner = new Scanner(System.in);
        boolean cont = false;
        System.out.println("Would you like to continue?");
        String hold = scanner.nextLine();
        if (hold.equalsIgnoreCase("yes") || hold.equalsIgnoreCase("y")){
            cont = true;
        }
        return cont;
    }
    public static boolean test(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        return num == 3;
    }
    public static boolean isEven(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int num = scanner.nextInt();
        return num%2==0;
    }
    public static void isEvenRandom(){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int num;
        boolean loop = true;
        do {
            num = rand.nextInt(9999)+1;
            if (num%2==0){
                System.out.println(num + " is even");
            }
            else {
                System.out.println(num + " is odd");
            }
            System.out.println("Loop?");
            String hold = scanner.nextLine();
            if (!hold.equalsIgnoreCase("yes")&&!hold.equalsIgnoreCase("y")){
                loop = false;
            }
        }while (loop);
    }
}

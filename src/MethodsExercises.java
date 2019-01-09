import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println(add(1,2));
        System.out.println(subtract(3,2));
        System.out.println(multiply(2,3));
        System.out.println(divide(4,2));
        System.out.println(modulus(5,2));
        System.out.println("Enter a min number.");
        int min = scanner.nextInt();
        System.out.println("Enter a max number.");
        int max = scanner.nextInt();
        System.out.println("Enter a number between "+min+" and "+max);
        int num = getInteger(min,max);
        System.out.println("You entered "+ num);
        System.out.println("Please enter a number between 1 and 10.");
        int fact = scanner.nextInt();
        long result = factorial(fact);
        System.out.println("Your factorial is "+result);
        System.out.println("How many dice do you want to roll?");
        int diceCount = scanner.nextInt();
        System.out.println("How many sides does each dice have?");
        int diceSides = scanner.nextInt();
        long diceTotal = diceRoll(diceCount,diceSides);
        System.out.println("The total of all rolls is "+ diceTotal);
        int guesses = HighLow();
        System.out.println("It took you "+guesses+ " guesses.");


    }
    public static long add (int first, int second){
        return (first + second);
    }
    public static long subtract (int first, int second){
        return (first-second);
    }
    public static long multiply (int first, int second){
        return (first*second);
    }
    public static long divide (int first, int second){
        return (first/second);
    }
    public static long modulus (int first, int second){
        return (first%second);
    }
    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        int input = scanner.nextInt();
        if (input < min || input > max){
            System.out.println("Number not in range, please enter another number.");
           return getInteger(min,max);
        }
        return input;
    }
    public static long factorial (int number){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        long hold = 1;
        if (number<1 || number>10){
            System.out.println("Please enter another number.");
            int num = scanner.nextInt();
            factorial(num);
        }
        for (int count = 1; count <= number; count++ ){
            hold *= count;
        }
        return hold;
    }
    public static long diceRoll (int number, int sides){
        Random rand = new Random();
        long total = 0;
        for (int rolls = 1; rolls <= number; rolls++){
            int roll = rand.nextInt(sides)+1;
            System.out.println("You rolled a " +roll);
            total += roll;
        }
        return total;
    }
    public static int HighLow() {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        int number = rand.nextInt(100)+1;
        boolean guessed = true;
        System.out.println("I am thinking of a number between 1 and 100, try to guess it.");
        int guess = scanner.nextInt();
        int guesses = 0;
        while (guessed){
            if (guess<number){
                System.out.println("Too low, try again.");
                guesses++;
                guess = scanner.nextInt();
            }
            else if (guess>number){
                System.out.println("Too high, try again.");
                guesses++;
                guess =scanner.nextInt();
            }
            else {
                System.out.println("You got it!");
                System.out.println("The number was "+ number);
                guesses++;
                guessed = false;
            }
        }
        return guesses;

    }
}

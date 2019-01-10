import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        boolean roll =true;
        System.out.println(add(1,2));
        System.out.println(subtract(3,2));
        System.out.println(multiply(2,3));
        System.out.println(multiplyLoop(3,7));
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
        scanner.nextLine();
        long result = factorial(fact);
        System.out.println("Your factorial is "+result);
        System.out.println("Run recursive factorial?");
        String rfact = scanner.nextLine();
        if (rfact.equalsIgnoreCase("yes")||rfact.equalsIgnoreCase("y")){
            System.out.println("Please enter a number between 1 and 20.");
            int bfactorial = scanner.nextInt();
            while (bfactorial>20 || bfactorial<1){
                System.out.println("Please enter a number between 1 and 20.");
                bfactorial = scanner.nextInt();
            }
            int factCount = 1;
            int factHold = 1;
            long bfactResult = factorialBonus(bfactorial, factCount, factHold);
            System.out.println("Your factorial is "+bfactResult);
        }
        System.out.println("How many dice do you want to roll?");
        int diceCount = scanner.nextInt();
        System.out.println("How many sides does each dice have?");
        int diceSides = scanner.nextInt();
        scanner.nextLine();
        long diceTotal = diceRoll(diceCount,diceSides);
        System.out.println("The total of all rolls is "+ diceTotal);
        while (roll){
            System.out.println("Do you want to roll again?");
            String confirm = scanner.nextLine();
            if (confirm.equalsIgnoreCase("yes")|| confirm.equalsIgnoreCase("y")){
                diceTotal = diceRoll(diceCount,diceSides);
                System.out.println("The total of all rolls is "+ diceTotal);
            }
            else {
                roll = false;
            }
        }
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
    public static long multiplyLoop (int first, int second){
        long hold = 0;
        for (int count = 1; count <= first; count++){
            hold += second;
        }
        return hold;
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
            System.out.println(hold + "*" + count + "=" + (hold * count));
            hold *= count;
        }
        return hold;
    }
    public static long factorialBonus (int number, int count, long hold){
        if (count <= number){
            int holdNumber = number;
            hold *=count;
            count++;
            System.out.println(hold);
            return factorialBonus(holdNumber,count,hold);
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
        boolean guessing = true;
        System.out.println("I am thinking of a number between 1 and 100, try to guess it.");
        int guess = scanner.nextInt();
        int guesses = 0;
        while (guessing){
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
                guessing = false;
            }
        }
        return guesses;

    }
}

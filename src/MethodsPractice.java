import util.Input;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class MethodsPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
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
//        isEvenRandom();
//        boolean odd = isOdd();
//        if (odd){
//            System.out.println("Number is odd");
//        }
//        else{
//            System.out.println("Number is even");
//        }
//        System.out.println("Enter a number to start at.");
//        int first = scanner.nextInt();
//        System.out.println("Enter a number to end at.");
//        int last = scanner.nextInt();
//        int oddCount = countOdds(first,last);
//        System.out.println("Between "+ first + " and "+ last + " there are " + oddCount + " odd numbers.");
//        System.out.println("Enter a number to start at.");
//        first = scanner.nextInt();
//        System.out.println("Enter a number to end at.");
//        last = scanner.nextInt();
//        int evenCount = countEvens(first,last);
//        System.out.println("Between "+ first + " and "+ last + " there are " + evenCount + " even numbers.");
//        boolean vowel = isVowel();
//        if (vowel){
//            System.out.println("That is a vowel");
//        }
//        else {
//            System.out.println("That is not a vowel");
//        }
//        boolean hasVowel = hasVowels();
//        if (hasVowel){
//            System.out.println("That has a vowel");
//        }
//        else {
//            System.out.println("That does not have a vowel");
//        }
//        int vowels = countVowels();
//        System.out.println("That string has "+ vowels + " vowels.");
//        int fizzCount = 1;
//        fizzBuzz(fizzCount);
//        boolean primeLoop =true;
//        while (primeLoop){
//            boolean prime = isPrime();
//            if (prime){
//                System.out.println("Number is prime");
//            }
//            else {
//                System.out.println("Number is not prime");
//            }
//            System.out.println("Check another number?");
//            String loopCheck = scanner.nextLine();
//            if (!loopCheck.equalsIgnoreCase("yes")&&!loopCheck.equalsIgnoreCase("y")){
//                primeLoop = false;
//            }
//        }
//        getTwentyPrimes();
//        System.out.println("How many times would you like to flip a coin?");
//        int flips = scanner.nextInt();
//        int countdown = 1;
//        int heads = 0;
//        int tails = 0;
//        while (countdown <= flips) {
//            if (coinFlip()) {
//                System.out.println("Heads");
//                heads++;
//            } else {
//                System.out.println("Tails");
//                tails++;
//            }
//            countdown++;
//        }
//        if (heads > 0) {
//            System.out.println("Heads: "+heads);
//        }
//        if (tails > 0){
//            System.out.println("Tails: "+tails);
//        }
//        System.out.println("How many steps?");
//        int steps = scanner.nextInt();
//        StringBuilder sequence = randomWalk(steps);
//        System.out.println(sequence);
//        System.out.println("Number of ones: " + countOnes(sequence));
//        System.out.println("Number of zeroes: " + countZeroes(sequence));
//        analyzeWalk(sequence);
//        System.out.println("Longest run is: " + longestRun(sequence,1));
//        //Modified longestRun to also work as secondLongestRun, thus they are called from the same method
//        System.out.println("Second longest run is " + longestRun(sequence,2));
//        System.out.println(magic8Ball("Test"));
//        dndDiceRoll();
//        l5rDiceRoll();
//        String question = Input.getString("Ask a question");
//        magic8Ball(question);
//        switchTest();
    }

    public static void firstChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type something.");
        String hold = scanner.nextLine();
        char result = hold.charAt(0);
        System.out.println(result);
    }

    public static void secondChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type something.");
        String hold = scanner.nextLine();
        char result = hold.charAt(1);
        System.out.println(result);
    }

    public static void lastChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type something.");
        String hold = scanner.nextLine();
        int length = hold.length();
        char result = hold.charAt(length - 1);
        System.out.println(result);
    }

    public static void secondToLastChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type something.");
        String hold = scanner.nextLine();
        int length = hold.length();
        char result = hold.charAt(length - 2);
        System.out.println(result);
    }

    public static boolean userWantsToContinue() {
        Scanner scanner = new Scanner(System.in);
        boolean cont = false;
        System.out.println("Would you like to continue?");
        String hold = scanner.nextLine();
        if (hold.equalsIgnoreCase("yes") || hold.equalsIgnoreCase("y")) {
            cont = true;
        }
        return cont;
    }

    public static boolean test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        return num == 3;
    }

    public static boolean isEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int num = scanner.nextInt();
        return num % 2 == 0;
    }

    public static void isEvenRandom() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int num;
        boolean loop = true;
        do {
            num = rand.nextInt(9999) + 1;
            if (num % 2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
            System.out.println("Loop?");
            String hold = scanner.nextLine();
            if (!hold.equalsIgnoreCase("yes") && !hold.equalsIgnoreCase("y")) {
                loop = false;
            }
        } while (loop);
    }

    public static boolean isOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int num = scanner.nextInt();
        return num % 2 == 1;
    }

    public static int countOdds(int first, int last) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        int count = first + 1;
        int oddCount = 0;
        while (count < last) {
            if (count % 2 == 1) {
                oddCount++;
            }
            count++;
        }
        return oddCount;

    }

    public static int countEvens(int first, int last) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        int count = first + 1;
        int evenCount = 0;
        while (count < last) {
            if (count % 2 == 0) {
                evenCount++;
            }
            count++;
        }
        return evenCount;
    }

    public static boolean isVowel() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println("Enter a character.");
        String character = scanner.nextLine();
        while (character.length() > 1 || character.length() < 1) {
            System.out.println("Please only enter a single character");
            character = scanner.nextLine();
        }
        return (character.equalsIgnoreCase("a") || character.equalsIgnoreCase("e") || character.equalsIgnoreCase("i") || character.equalsIgnoreCase("o") || character.equalsIgnoreCase("u"));
    }

    public static boolean hasVowels() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println("Enter a string.");
        String character = scanner.nextLine();
        character = character.toLowerCase();
        return (character.contains("a") || character.contains("e") || character.contains("i") || character.contains("o") || character.contains("u"));
    }

    public static int countVowels() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println("Enter a string.");
        String sent = scanner.nextLine();
        int length = sent.length();
        int vowelCount = 0;
        for (int count = 0; count < length; count++) {
            char temp = sent.charAt(count);
            temp = Character.toLowerCase(temp);
            if (temp == 'a') {
                vowelCount++;
            } else if (temp == 'e') {
                vowelCount++;
            } else if (temp == 'i') {
                vowelCount++;
            } else if (temp == 'o') {
                vowelCount++;
            } else if (temp == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static void fizzBuzz(int fizzCount) {
        if (fizzCount <= 100) {
            String hold = "";
            if (fizzCount % 3 == 0) {
                hold += "Fizz";
            }
            if (fizzCount % 5 == 0) {
                hold += "Buzz";
            }
            if (fizzCount % 3 != 0 && fizzCount % 5 != 0) {
                hold += fizzCount;
            }
            System.out.println(hold);
            fizzCount++;
            fizzBuzz(fizzCount);
        }
    }

    public static boolean isPrime() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println("Enter a number.");
        int num = scanner.nextInt();
        int track = primeTracker(num);
        return (track == 2);
    }

    public static void getTwentyPrimes() {
        StringBuilder sb = new StringBuilder();
        int num = 2;
        int track = 0;
        while (track < 20) {
            int mod = primeTracker(num);
            if (mod == 2) {
                if (track == 19) {
                    sb.append(num);
                } else {
                    sb.append(num).append(", ");
                }
                track++;
            }
            num++;
        }
        System.out.println(sb);
    }

    // This is used to check for primes by counting how many times a number can be evenly divided
    public static int primeTracker(int num) {
        int count = 1;
        int mod = 0;
        while (count <= num) {
            if (num % count == 0) {
                mod++;
            }
            count++;
        }
        return mod;
    }

    public static boolean coinFlip() {
        Random rand = new Random();
        int flip = rand.nextInt(2);
        return flip == 1;
    }

    public static StringBuilder randomWalk(int steps) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        while (steps > 0) {
            int step = rand.nextInt(2);
            sb.append(step);
            steps--;
        }
        return sb;
    }

    public static int countOnes(StringBuilder list) {
        int length = list.length();
        int count = 0;
        int one = 0;
        while (count <= length - 1) {
            char temp = list.charAt(count);
            if (temp == '1') {
                one++;
            }
            count++;
        }
        return one;
    }

    public static int countZeroes(StringBuilder list) {
        int length = list.length();
        int count = 0;
        int zero = 0;
        while (count <= length - 1) {
            char temp = list.charAt(count);
            if (temp == '0') {
                zero++;
            }
            count++;
        }
        return zero;
    }

    public static void analyzeWalk(StringBuilder list) {
        int ones = countOnes(list);
        int zeroes = countZeroes(list);
        System.out.println("There are " + zeroes + " zeroes and " + ones + " ones.");
    }

    public static int longestRun(StringBuilder list, int pick) {
        int length = list.length();
        int count = 0;
        int output = 0;
        int longest = 0;
        int secondLongest = 0;
        int tempHold;
        while (count <= length - 1) {
            char temp = (list.charAt(count));
            int step = 0;
            int hold = 0;
            while (step <= length - 1) {
                if (list.charAt(step) == temp) {
                    hold++;
                } else {
                    tempHold = hold;
                    if (hold > longest) {
                        longest = hold;
                    }
                    if (hold<longest){
                        if (tempHold>secondLongest){
                            secondLongest=tempHold;
                        }
                    }
                    hold = 0;
                }
                if (step == length - 1) {
                    if (hold > longest) {
                        longest = hold;
                        hold = 0;
                    }
                }
                step++;
            }
            count++;
        }
        if (pick==1) {
            output = longest;
        }
        if (pick==2) {
            output = secondLongest;
        }
        return output;
    }
    public static String magic8Ball (String question){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        if (!question.contains("?")){
            System.out.println("Please ask a question.");
            String newQuestion = scanner.nextLine();
            magic8Ball(newQuestion);
        }
        int ball = rand.nextInt(7)+1;
        String answer = "";
        switch (ball){
            case 1: answer = "Outlook not so good";
            break;
            case 2: answer = "Ask again later";
            break;
            case 3: answer = "All signs point to yes";
            break;
            case 4: answer = "Very doubtful";
            break;
            case 5: answer = "It is certain";
            break;
            case 6: answer = "Don't count on it";
            break;
        }
        return answer;

    }
    public static void dndDiceRoll(){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        Random rand = new Random();
        System.out.println("Please enter how many dice with how many sides hou would like to roll in this format,1d2");
        String dice = scanner.nextLine();
        Scanner roll = new Scanner(dice);
        roll.useDelimiter("d");
        int x= roll.nextInt();
        int y = roll.nextInt();
        int count = 1;
        int hold = 0;
        while (count<=x){
            int temp = rand.nextInt(y)+1;
            System.out.println(temp);
            hold += temp;
            count++;
        }
        System.out.println("Total of all rolls is "+ hold);
    }

    public static void l5rDiceRoll(){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        Random rand = new Random();
        System.out.println("Put the stuff in, XrY");
        String dice = scanner.nextLine();
        Scanner roll = new Scanner(dice);
        roll.useDelimiter("r");
        int diceNum = roll.nextInt();
        int keep = roll.nextInt();
        int count = 1;
        int arrayCount = 0;
        Integer intarray[];
        intarray = new Integer[diceNum];
        while (count<=diceNum){
            int hold = rand.nextInt(10)+1;
            System.out.println(hold);
            intarray[arrayCount]=hold;
            count++;
            arrayCount++;
        }
        Arrays.sort(intarray, Collections.reverseOrder());
        System.out.println("Here are your " + keep + " highest rolls:");
        int step = 0;
        while (step<=keep-1){
            System.out.println(intarray[step]);
            step++;
        }

    }
    public static void switchTest(){
        int test = Input.getInt("Enter a number, 1-3");
        switch (test){
            case 1:
                System.out.println(test);
            case 2:
                System.out.println(test);
            case 3:
                System.out.println(test);
                if (Input.yesNo()){
                    switchTest();
                }
        }
    }
    public static int [] shuffleTest(int[] array){
        Random rand = new Random();
        for (int i = 0; i<array.length;i++){
            int random = rand.nextInt(array.length);
            int temp = array[i];
            array[i]=array[random];
            array[random]=temp;
        }
        return array;
    }
}

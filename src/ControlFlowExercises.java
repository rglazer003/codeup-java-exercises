import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        int i = 5;
        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int count = 0; count <= 100; count += 2) {
            System.out.println(count);
        }
        for (int count = 100; count >= 0; count -= 5) {
            System.out.println(count);
        }
        for (long num = 2; num <= 1000000; num *= num) {
            System.out.println(num);
        }
        for (int count = 1; count <= 100; count++) {
            if (count % 3 == 0 && count % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (count % 3 == 0) {
                System.out.println("Fizz");
            } else if (count % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(count);
            }
        }

        System.out.println("What number would you like to go up to?");
        int number = scanner.nextInt();
        System.out.println("Here is your table:");
        System.out.println("Number | Squared | Cubed");
        System.out.println("------ | ------- | -----");
        for (int count = 1; count <= number; count++) {
            System.out.println((count) + "      |" + (count * count) + "        |" + (count * count * count));
        }
        System.out.println("Please enter a numeric grade.");
        int grade = scanner.nextInt();
        boolean loop = true;
        while (loop) {
            if (grade >= 88) {
                System.out.println("Your grade is A");
            } else if (grade >= 80) {
                System.out.println("Your grade is B");
            } else if (grade >= 67) {
                System.out.println("Your grade is C");
            } else if (grade >= 60) {
                System.out.println("Your grade is D");
            } else {
                System.out.println("Your grade is F");
            }
            System.out.println("Would you like to continue?");
            scanner.nextLine();
            String det = scanner.nextLine();
            if (det.equals("yes") || det.equals("y")) {
                System.out.println("Please enter a grade.");
                grade = scanner.nextInt();
            } else {
                loop = false;
            }
        }
    }
}

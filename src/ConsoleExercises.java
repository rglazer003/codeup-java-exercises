import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        double pi = 3.14159;
        System.out.printf("The value of pi is %.2f%n", pi);
        System.out.println("Please enter a number.");
        int number = scanner.nextInt();
        System.out.println(number);
        System.out.println("Please enter three words.");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.println(word1 + " "+ word2 + " " + word3);
        System.out.println("Please type a sentence.");
        scanner.nextLine();
        String sent = scanner.nextLine();
        System.out.println(sent);
        System.out.println("Please enter length of room.");
        String first = scanner.nextLine();
        System.out.println("Please enter width of room.");
        String second = scanner.nextLine();
        double length = Double.parseDouble(first);
        double width = Double.parseDouble(second);
        double perimeter = (length*2)+(width*2);
        System.out.println("Perimeter of room is " + perimeter);
        double area = length*width;
        System.out.println("Area of room is " + area);
//        String test = "1 2 3 dog 4 cat bird";
//        Scanner s = new Scanner(test);
//        System.out.println(s.nextInt());
//        System.out.println(s.nextInt());
//        System.out.println(s.nextInt());
//        System.out.println(s.next());

    }
}

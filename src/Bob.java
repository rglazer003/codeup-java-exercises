import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println("Say something to Bob. To stop talking to Bob type end.");
        String conv = scanner.nextLine();
        boolean loop = true;

        while (loop){
            if (conv.endsWith("!")){
                System.out.println("Whoa, chill out!");
            }
            else if (conv.endsWith("?")){
                System.out.println("Sure.");
            }
            else if (conv.equals("")){
                System.out.println("Fine. Be that way!");
            }
            else if (conv.equalsIgnoreCase("end") || conv.equalsIgnoreCase("end.")){
                System.out.println("Cya.");
                break;
            }
            else {
                System.out.println("Whatever.");
            }
            conv = scanner.nextLine();
        }

    }
}

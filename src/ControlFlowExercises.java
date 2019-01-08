public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        int count = 0;
        do {
            System.out.println(count);
            count += 2;
        } while (count < 100);
        do {
            System.out.println(count);
            count -= 5;
        } while (count >= 0);
        long num = 2;
        do {
            System.out.println(num);
            num *= num;
        } while (num <= 1000000);
    }
}

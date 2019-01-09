public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(subtract(3,2));
        System.out.println(multiply(2,3));
        System.out.println(divide(4,2));
        System.out.println(modulus(5,2));
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
}

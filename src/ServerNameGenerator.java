import util.Input;

import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String nouns [] = {"House", "Hammer", "Bird", "Cat", "Dog", "Stick", "Cloud", "Pizza", "Dice", "Salmon"};
        String adjectives [] = {"Doom", "Mood", "20-Sided", "Burning", "Cruddy", "Enchanted", "Electric", "Magic", "Marble", "Tasteful"};
        boolean loop;
        do {
            randomName(nouns, adjectives);
            System.out.println("Get another?");
            loop = Input.yesNo();
        } while (loop);
    }
    public static void randomName(String array1[], String array2[]){
        Random random = new Random();
        int length = array1.length;
        int rand1 = random.nextInt(length);
        int rand2 = random.nextInt(length);
        System.out.println("Here is your server name:");
        System.out.println(array2[rand1]+"-"+array1[rand2]);
    }
}

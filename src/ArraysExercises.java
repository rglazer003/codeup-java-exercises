import util.Input;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String hold = Arrays.toString(numbers);
        System.out.println(hold);
        Person [] people = new Person[3];
        for (int i = 0; i <=2; i++){
            String name = Input.getString("Enter a name");
            people[i] = new Person(name);
        }
        for (int i = 0; i <=2; i++) {
            System.out.println(people[i].getName());
        }
        Person [] newPeople = addPerson(people);
        int length = newPeople.length;
        for (int i = 0; i<=length-1;i++){
            System.out.println(newPeople[i].getName());
        }
    }
    public static Person[] addPerson(Person people[]){
        Person [] newList = new Person[people.length+1];
        for (int i = 0; i<=people.length-1;i++){
            newList[i]=people[i];
        }
        String name = Input.getString("Enter a name");
        newList[newList.length-1] = new Person(name);
        return newList;
    }
}

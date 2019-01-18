package grades;

import util.Input;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        students.put("user1", new Student("Dan"));
        students.put("user2", new Student("Jan"));
        students.put("user3", new Student("Tom"));
        students.put("user4", new Student("Sally"));
        students.get("user1").addGrade(80);
        students.get("user1").addGrade(67);
        students.get("user1").addGrade(93);
        students.get("user2").addGrade(91);
        students.get("user2").addGrade(73);
        students.get("user2").addGrade(72);
        students.get("user3").addGrade(81);
        students.get("user3").addGrade(94);
        students.get("user3").addGrade(88);
        students.get("user4").addGrade(97);
        students.get("user4").addGrade(65);
        students.get("user4").addGrade(82);
        System.out.println("Listing github users:");
        for (String userName: students.keySet()){
            System.out.println(userName);
        }
        System.out.println("All");
        boolean loop = true;
        do {
            System.out.println("Which user would you to see more information about?");
            String input = Input.getString();
            if (input.equalsIgnoreCase("all")){
                for (Map.Entry<String, Student> entry: students.entrySet()){
                    System.out.println("----------");
                    String key = entry.getKey();
                    System.out.println(key);
                    System.out.println(students.get(key).getName());
                    System.out.println("User grades are a follows:");
                    students.get(key).listGrades();

                }
            }
            else if (!students.containsKey(input)){
                System.out.println("Username not found, please enter a valid username");
            }
            else {
                System.out.println("User name is "+ students.get(input).getName());
                System.out.println("User grades are a follows");
                students.get(input).listGrades();
                System.out.println("User grade average is: " + students.get(input).average());
                System.out.println("Would you like to look up another user?");
            }
            System.out.println("Would you like to look up another user?");
            String confirm = Input.getString();
            loop = (confirm.equalsIgnoreCase("yes")||confirm.equalsIgnoreCase("y"));
        }while (loop);
        System.out.println("Goodbye");

    }
}

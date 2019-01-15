package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        boolean loop;
        Movie [] listAll = MoviesArray.findAll();
        do {
            listOptions();
            int choice = Input.getIntMovie(0,6);
            Input.waitForEnter();
            if (choice == 0){
                break;
            }
            if (choice == 1){
                int list = 1;
                listMovies(listAll);
            }
            if (choice == 2){
                int list = 1;
                int count = 0;
                for (Movie movie: listAll){
                    String check = movie.getCategory();
                    if (check.equalsIgnoreCase("animated")){
                        count++;
                    }
                }
                Movie [] animatedList = new Movie[count];
                int step = 0;
                for (Movie movie: listAll){
                    String check = movie.getCategory();
                    if (check.equalsIgnoreCase("animated")){
                        animatedList[step]=movie;
                        step++;
                    }
                }
                listMovies(animatedList);
            }
            if (choice == 3) {
                int list = 1;
                int count = 0;
                for (Movie movie: listAll){
                    String check = movie.getCategory();
                    if (check.equalsIgnoreCase("drama")){
                        count++;
                    }
                }
                Movie [] dramaList = new Movie[count];
                int step = 0;
                for (Movie movie: listAll){
                    String check = movie.getCategory();
                    if (check.equalsIgnoreCase("drama")){
                        dramaList[step]=movie;
                        step++;
                    }
                }
                listMovies(dramaList);
            }
            if (choice == 4){
                int list = 1;
                int count = 0;
                for (Movie movie: listAll){
                    String check = movie.getCategory();
                    if (check.equalsIgnoreCase("horror")){
                        count++;
                    }
                }
                Movie [] horrorList = new Movie[count];
                int step = 0;
                for (Movie movie: listAll){
                    String check = movie.getCategory();
                    if (check.equalsIgnoreCase("horror")){
                        horrorList[step]=movie;
                        step++;
                    }
                }
                listMovies(horrorList);
            }
            if (choice == 5){
                int list = 1;
                int count = 0;
                for (Movie movie: listAll){
                    String check = movie.getCategory();
                    if (check.equalsIgnoreCase("scifi")){
                        count++;
                    }
                }
                Movie [] scifiList = new Movie[count];
                int step = 0;
                for (Movie movie: listAll){
                    String check = movie.getCategory();
                    if (check.equalsIgnoreCase("scifi")){
                        scifiList[step]=movie;
                        step++;
                    }
                }
                listMovies(scifiList);
            }
            if (choice == 6){
                int length = listAll.length;
                System.out.println("Enter name");
                String name = Input.getString();
                System.out.println("Enter category");
                String category = Input.getString();
                Movie [] newList = new Movie[length+1];
                int i = 0;
                for (Movie movie: listAll){
                    newList[i]=movie;
                    i++;
                }
                Movie newMovie = new Movie(name,category);
                newList[length]=newMovie;
                listMovies(newList);
                listAll=newList;
            }
            System.out.println("Press enter to continue");
            Input.waitForEnter();
            loop = Input.yesNo("Continue?");
        }while (loop);
        System.out.println("Goodbye");

    }
    public static void listOptions(){
        System.out.println("What would you like to do?\n0. Exit\n1. View all movies\n2. View Animated movies\n" +
                "3. View Drama movies\n4. View Horror movies\n5. View Scifi movies\n6. Add a movie");
    }
    public static void listMovies(Movie movies[]){
        int list = 1;
        for(Movie movie: movies){
            String name = movie.getName();
            String category = movie.getCategory();
            System.out.println(list+". Name: "+name+" Category: "+category);
            list++;
        }
    }


}

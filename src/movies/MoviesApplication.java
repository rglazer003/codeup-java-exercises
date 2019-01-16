package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        boolean loop;
        Movie [] listAll = MoviesArray.findAll();
        do {
            listOptions();
            int choice = Input.getIntMovie(0,8);
            Input.waitForEnter();
            if (choice == 0){
                break;
            }
            if (choice == 1){
                listMovies(listAll);
            }
            if (choice == 2){
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
                int count = 0;
                for (Movie movie: listAll){
                    String check = movie.getCategory();
                    if (check.equalsIgnoreCase("musical")){
                        count++;
                    }
                }
                Movie [] musicalList = new Movie[count];
                int step = 0;
                for (Movie movie: listAll){
                    String check = movie.getCategory();
                    if (check.equalsIgnoreCase("musical")){
                        musicalList[step]=movie;
                        step++;
                    }
                }
                listMovies(musicalList);
            }
            if (choice == 7){
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
            if (choice == 8){
                listMovies(listAll);
                System.out.println("Please enter number of movie to edit");
                int editNum = Input.getInt();
                Movie [] editArray = new Movie[1];
                editArray[0]=listAll[editNum-1];
                listMovies(editArray);
                Input.waitForEnter();
                String newName = Input.getString("Enter new name");
                String newCategory = Input.getString("Enter new category");
                listAll[editNum-1].setName(newName);
                listAll[editNum-1].setCategory(newCategory);
                editArray[0]=listAll[editNum-1];
                listMovies(editArray);
            }
            System.out.println("Press enter to continue");
            Input.waitForEnter();
            loop = Input.yesNoSilent("Continue?");
        }while (loop);
        System.out.println("Goodbye");

    }
    public static void listOptions(){
        System.out.println("What would you like to do?\n0. Exit\n1. View all movies\n2. View Animated movies\n" +
                "3. View Drama movies\n4. View Horror movies\n5. View Scifi movies\n6. View Musicals\n7. Add a movie\n8. Edit a movie");
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

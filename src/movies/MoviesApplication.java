package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        boolean loop;
        Movie [] listAll = MoviesArray.findAll();
        do {
            listOptions();
            int choice = Input.getIntMovie(0,10);
            Input.waitForEnter();
            if (choice == 0){
                break;
            }
            if (choice == 1){
                listMovies(listAll);
            }
            if (choice == 2){
                int count = getCount("animated", listAll);
                Movie [] animatedList = new Movie[count];
                animatedList = updateArray(listAll, animatedList, "animated");
                listMovies(animatedList);
            }
            if (choice == 3) {
                int count = getCount("drama", listAll);
                Movie [] dramaList = new Movie[count];
                dramaList = updateArray(listAll, dramaList, "drama");
                listMovies(dramaList);
            }
            if (choice == 4){
                int count = getCount("horror", listAll);
                Movie [] horrorList = new Movie[count];
                horrorList = updateArray(listAll, horrorList, "horror");
                listMovies(horrorList);
            }
            if (choice == 5){
                int count = getCount("scifi", listAll);
                Movie [] scifiList = new Movie[count];
                scifiList = updateArray(listAll, scifiList, "scifi");
                listMovies(scifiList);
            }
            if (choice == 6){
                int count = getCount("musical", listAll);
                Movie [] musicalList = new Movie[count];
                musicalList = updateArray(listAll, musicalList, "musical");
                listMovies(musicalList);
            }
            if (choice == 7){
                System.out.println("Please enter category to search for");
                String search = Input.getString();
                int count = getCount(search, listAll);
                Movie [] searchList = new Movie[count];
                searchList = updateArray(listAll, searchList, search);
                listMovies(searchList);
            }
            if (choice == 8){
                System.out.println("Please enter name to search for");
                String search = Input.getString();
                int count = 0;
                for (Movie movie: listAll){
                    String check = movie.getName();
                    if (check.equalsIgnoreCase(search)){
                        count++;
                    }
                }
                Movie [] searchList = new Movie[count];
                int step = 0;
                for (Movie movie: listAll){
                    String check = movie.getName();
                    if (check.equalsIgnoreCase(search)){
                        searchList[step]=movie;
                        step++;
                    }
                }
                listMovies(searchList);
            }
            if (choice == 9){
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
            if (choice == 10){
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
                "3. View Drama movies\n4. View Horror movies\n5. View Scifi movies\n6. View Musicals\n7. Manual category search\n8. Manual name search\n9. Add a movie\n10. Edit a movie");
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
    public static int getCount(String category, Movie[] array){
        int count = 0;
        for (Movie movie: array){
            String check = movie.getCategory();
            if (check.equalsIgnoreCase(category)){
                count++;
            }
        }
        return count;
    }
    public static Movie[] updateArray (Movie[] listArray, Movie [] updateArray, String category){
        int step = 0;
        for (Movie movie: listArray){
            String check = movie.getCategory();
            if (check.equalsIgnoreCase(category)){
                updateArray[step]=movie;
                step++;
            }
        }
        return updateArray;
    }

}

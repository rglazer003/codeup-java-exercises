package movies;

public class Movie {
    private String name;
    private String category;
    public Movie (String name, String category){
        this.name = name;
        this.category = category;
    }
    public String getName(){
        return this.name;
    }
    public String getCategory(){
        return this.category;
    }
    public void setName (String newName){
        this.name = newName;
    }
    public void setCategory (String newCategory){
        this.category = newCategory;
    }
}

public class Person {
    private String name;
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void sayHello(){
        System.out.println("Hello "+name);
    }
    public Person (String personName){
        this.name = personName;
    }

    public static void main(String[] args) {
//        Person person1 = new Person("Greg");
//        System.out.println(person1.getName());
//        person1.setName("Dan");
//        System.out.println(person1.getName());
//        person1.sayHello();
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}


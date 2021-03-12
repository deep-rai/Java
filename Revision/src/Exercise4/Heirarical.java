package Exercise4;

public class Heirarical {
    public String name,location;
    public int age;

    public void getName(String name){
        System.out.println("This is called from child class Heirarchy1");
    }
    public void getLocation(String location){
        System.out.println("The location is "+location);
    }
    public void getAge(int age){
        System.out.println("the age is "+age);
    }
}

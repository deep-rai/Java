package Exercise4;

public class SingleInheritance {
    public String name;
    public int age;

    public void getName(String name,int age){
        System.out.println(name+ " is his name");
        System.out.println("He is "+age+ " years old");
    }

    public void firstDisplay(){
        System.out.println("This is the parent's class");
    }
}

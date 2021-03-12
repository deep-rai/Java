package Exercise2;

public class Variable {
    //global variable
    public String name;
    public int age;
    public void display(String name,int age){
        System.out.println("The name is " + name);
        System.out.println("The age is "+ age);
        int a=5;
        System.out.println("This is local variable "+a);
    }
}

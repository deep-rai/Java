package Inheritance;

public class SingleInheritance {
    private String name;
    public int price;

    //public String setName(String name){
    //    this.name=name;
    //    return name;
    //}
    public void getName(String name){
        System.out.print("Name of the class"+name);
    }
    public void getPrice(int price)
    {
        System.out.println("Price is "+ price);
    }
}

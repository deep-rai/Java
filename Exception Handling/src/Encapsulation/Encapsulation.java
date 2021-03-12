package Encapsulation;

public class Encapsulation {
    private String name;
    private int price;

    public void setName(String name){
        this.name=name;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public void display(){
        System.out.println("Name "+name);
        System.out.println("Price "+ price);
    }
}

package Exercise6;

public class Encapsulation {
    private String carName;
    private int carPrice;
    private char warranty;

    public void setName(String carName){
        this.carName=carName;
    }
    public void setPrice(int carPrice){
        this.carPrice=carPrice;
    }
    public String getName(){
       return carName;
    }
    public int getPrice(){
        return carPrice;
    }
    public void display(){
        System.out.println("The name of car is " + carName);
        System.out.println("The price for car is "+ carPrice);

    }
}

package Interfae;

public class Vehicle implements Car,Bike {
   public void carPrice(double carPrice){
        double cp=carPrice+0.13*carPrice;

        System.out.println("The price of the car is "+cp);
    }
    //public void bikePrice(){
      //System.out.println("The price of the bike is 100000");
    //}

     int distanceTravelled=0;

}

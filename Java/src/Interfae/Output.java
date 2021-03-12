package Interfae;

public class Output extends Vehicle{
        public void output(){
            distanceTravelled=speed*distance;
            System.out.println("The distance travelled is "+distanceTravelled);
        }
        public static void main(String[] args) {
            Output obj=new Output();
            obj.output();
            obj.carPrice(10000);
        }
    }

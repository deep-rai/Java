package Throw;

public class Throw {
    public void thr(int a){
        try{
            if(a<18) {
                throw new ArithmeticException("Not eligible to vote");
            }

            else{
                System.out.println("Eligible");
            }
        }
        catch(ArithmeticException name){
            System.out.println("not eligible to vote");
        }
    }
}

package trycatch;

public class Excep {
    public void getTry() {

        try {
            int a=5;
            int b=0;
            int c=a/b;

        }
        catch (ArithmeticException varName)
            {
            //varName.printStackTrace();
                System.out.println("Not divisible by zero");
            }
        finally{
            System.out.println("This is always executed");
        }
    }
}

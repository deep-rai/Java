package Exercise10;
import java.util.Scanner;
public class ArOperation {
    public void add(int a,int b){
        int sum=a+b;
        System.out.println("The sum for frist method "+sum);
    }
    public void add(){
        int a=10;
        int b=100;
        int sum= a+b;
        System.out.println("The sum for second method is "+sum);
    }
    public void add(String message){
        System.out.println("This is the third method with string"+ message);
    }

    public void divide(){
        System.out.println("Enter two numbers to divide");
        Scanner input=new Scanner(System.in);
        double a=input.nextDouble();
        double b=input.nextDouble();
        try{
            double d=a/b;
            System.out.println("Output is"+d);
        }
        catch(ArithmeticException e){
            System.out.println("Cant divide by zero");
        }
        finally{
            System.out.println();
        }
    }
}

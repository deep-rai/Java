package exercise;
import java.util.Scanner;

public class Exercise {
    public void division(){
            System.out.println("Enter two numbers");
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            int b = input.nextInt();
            try{
                int div=a/b;
                System.out.println("The division is "+ div);
            }
            catch(ArithmeticException e){
                System.out.println("Cannot divide by zero");
            }
            finally{

            }


    }
    public void multiply(){
        System.out.println("Enter two numbers");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int mul=a*b;


    }
    public void substraction(){
        System.out.println("Enter two numbers");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sub=a-b;


    }
}

import java.util.Scanner;
public class Comparision2 {
    Scanner ascn=new Scanner(System.in);
    int a=ascn.nextInt();
    int b=ascn.nextInt();

    public void compare1(){
        if(a==5 && b==5){
            System.out.println("the numbers are equal to 5");
        }
        else{
            System.out.println("The numbers are not equal to 5");
        }
    }
    public void compare2(){
        if(a==3 || b==3){
            System.out.println("One of the number is 3");
        }
        else{
            System.out.println("None of the number is 3");
        }
    }
}

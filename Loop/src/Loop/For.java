package Loop;

import java.util.Scanner;

public class For {
    public void ite(){
        System.out.println("Enter the number of times u want to print");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        for (int i=0;i<a;i++){
            System.out.println("He he "+ i);
        }
    }
    public void nested(){
        for(int i=0;i<=5;i++){

        }
    }
}

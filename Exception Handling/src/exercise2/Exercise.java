package exercise2;

import java.util.Scanner;

public class Exercise {
    public void compare(){
        System.out.println("Enter the name ");
        Scanner input= new Scanner(System.in);
        String name=input.nextLine();
        if(name.equals("Name")){
            System.out.println("Equals");
        }
        else{
            System.out.println("not equal");
        }


    }
}

package Exercise8;
import java.util.Scanner;

public class Circle {
    public void areaOfCircle(){
        System.out.println("Enter the radius of circle");
        Scanner input =new Scanner(System.in);
        double radius=input.nextDouble();
        final double pi= 3.14;
        double area=pi*radius*radius;
        System.out.println("The radius of circle is "+area);
    }
}

package Super;

public class B extends A{
    public void display(){
        //System.out.println("Name is " +super.name);
    }
    public static void main(String[] args) {
        B obj=new B();
        obj.getPrice();
        System.out.println(obj.getName());
        //obj.display();
        //obj.display();
       //System.out.println("Name is" + super.display());
    }
}

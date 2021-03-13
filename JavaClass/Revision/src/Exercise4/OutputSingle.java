package Exercise4;

public class OutputSingle extends SingleInheritance{
    public static void main(String[] args) {
        OutputSingle obj = new OutputSingle();
        obj.getName("Anmol",40);
    }
    public void display(){
        System.out.println("This is in the child's class");
    }
}

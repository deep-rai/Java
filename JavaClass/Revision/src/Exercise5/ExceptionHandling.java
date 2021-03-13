package Exercise5;

public class ExceptionHandling {
    public void array(){
        int[] array={1,4,7,9,5};
        try{
            for(int i=0;i< array.length+1;i++){
                System.out.print(" "+array[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println();
            System.out.println("Array is out of bounds");
        }
        finally{
            System.out.println("The final coding is continued");
        }
    }
}

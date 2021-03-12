package Exercise7;

public class Sort {

    public void Ascending(){
        int temp;
        int[] a={10,5,8,4,11,1,2};
        try {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] > a[j + 1]) {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("There is error in the iteration");

        }
        finally {
            for (int k = 0; k < a.length; k++) {
                System.out.print(" " + a[k]);
            }
        }
    }
}

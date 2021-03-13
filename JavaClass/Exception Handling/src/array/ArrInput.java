package array;

public class ArrInput {
    public void demo(){
        String[] arr={"bike","car","cycle"};
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    public void sum(){

        int[] arr={1,5,6,8};
        int s=0;
        for(int i=0;i<arr.length;i++){
            s=s+arr[i];
        }
        System.out.println("sum is "+s );
    }
}

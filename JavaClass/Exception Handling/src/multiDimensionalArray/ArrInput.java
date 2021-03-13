package multiDimensionalArray;

public class ArrInput {
    public void inp(){
        int arr[][]={{22,44,55},{1,4,6} };
        int ne[][]={{3,56,7},{58,8,2}};

        int total[][];
        total=new int[2][2];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<ne.length;j++){
                total[i][j]=arr[i][j]+ne[i][j];
                System.out.print(total[i][j]+" ");
            }
            System.out.println();

        }
    }
}

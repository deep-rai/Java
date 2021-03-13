package Switch;

public class Continue {
    public void switchCase(){
        for(int i=0;i<10;i++){
            int a=10;
            switch(i){
                case 5:
                    System.out.println("Hello");
                    continue;
            }
        }
    }
}

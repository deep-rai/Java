package ArrayList.Exercise2;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteration {
    public void iterator(){
        ArrayList<String> arrString=new ArrayList<String>();
        arrString.add("First String");
        arrString.add("Second String");
        arrString.add("Third String");
        arrString.add("Fourth String");
        arrString.add("Fifth String");
        arrString.add("Sixth String");
        System.out.println("Iteration using iterator");
        Iterator loop=arrString.iterator();
        while(loop.hasNext()){
            System.out.println(loop.next());
        }
    }
}

package ArrayList.Exercise3;

import java.util.ArrayList;

public class ForEachLoop {
    public void loopForEach(){
        ArrayList<String> arrString=new ArrayList<String>();
        arrString.add("First ");
        arrString.add("2nd");
        arrString.add("3rd");
        arrString.add("4th");
        arrString.add("5th");
        arrString.add("6th");
        arrString.add("7th");
        arrString.forEach((n)-> System.out.println(n));
    }
}

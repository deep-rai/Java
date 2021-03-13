package ArrayList.Exercise;

import java.util.ArrayList;

public class ArrayString {
    public void addObject(){
        ArrayList<String> arrString=new ArrayList<String>();
        arrString.add("This is added first");
        arrString.add("This is added second ");
        arrString.add("This is added third ");
        arrString.add("This is added fourth ");
        System.out.println(arrString);
        arrString.remove(3);
        System.out.println(arrString);
    }
}

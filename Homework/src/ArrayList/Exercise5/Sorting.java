package ArrayList.Exercise5;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public void sort(){
        ArrayList<String> arrList=new ArrayList<String>();
        arrList.add("Banana");
        arrList.add("Dog");
        arrList.add("Owl");
        arrList.add("Zebra");
        arrList.add("Monkey");
        arrList.add("Apple");
        Collections.sort(arrList);
        System.out.println(arrList);
    }
}

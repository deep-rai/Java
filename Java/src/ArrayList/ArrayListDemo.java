package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public void list(){
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(2);
        arrayList.add(10);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(7);
        arrayList.add(1);
        arrayList.add(5);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        arrayList.remove(1);
        arrayList.remove(0);
        System.out.println(arrayList);
        for(int v:arrayList){
            System.out.println(v);
        }
    }
    //public void stringList(){
      //  ArrayList<String> stringArrayList=new ArrayList<String>();
    //}
}

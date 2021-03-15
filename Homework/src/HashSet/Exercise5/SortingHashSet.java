package HashSet.Exercise5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SortingHashSet {
    public void sort(){
        HashSet<String> hashString=new HashSet<String>();
        hashString.add("Green");
        hashString.add("Blue");
        hashString.add("Red");
        hashString.add("Yellow");
        hashString.add("Orange");
        hashString.add("Purple");
        System.out.println("original"+ hashString);
        //for sorting we use list
        List<String> list=new ArrayList<String>(hashString);
        Collections.sort(list);
        System.out.println(list);
    }

    public void intSort(){
        HashSet<Integer> intHash=new HashSet<>();
        intHash.add(11);
        intHash.add(20);
        intHash.add(30);
        intHash.add(1);
        intHash.add(13);
        intHash.add(55);
        intHash.add(59);
        intHash.add(9);
        System.out.println(intHash);
        //for sorting
        List<Integer> sortList=new ArrayList<Integer>(intHash);
        Collections.sort(sortList);
        System.out.println(sortList);
    }
}

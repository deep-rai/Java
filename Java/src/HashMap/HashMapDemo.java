package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapDemo {
    public void hash1(){
        HashMap<Integer,String> list=new HashMap<Integer,String>();
        list.put(1,"First");
        list.put(2,"Second");
        list.put(3,"Third");
        System.out.println(list);
        list.remove(1);
       // System.out.println(list);
        System.out.println(list.get(2));
    }
    public void setDemo(){
        Set<Integer> list=new HashSet<Integer>();
        Set<Integer> list1=new HashSet<Integer>();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(11);
        list.add(10);
        list1.add(4);
        list1.add(2);
        list1.add(9);
        list1.add(3);
        list1.add(1);
        //System.out.println("The intersection for the sets is " + list.retainAll(list1));
        //System.out.println("The union for the sets is " + list.contains(list1));
        //list.addAll(list1);
        //System.out.println(list);
        for(int i:list){
          if(i==1){
              System.out.println("The number is 2");
              break;
          }
          else {
              System.out.println("The number cant be found");
          }
        }

        //list.retainAll(list1);
        //System.out.println(list);


    }
}

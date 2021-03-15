package HashSet.Exercise3;

import java.util.HashSet;

public class HashSetForEach {
    public void loopForEach(){
        HashSet<String> hashString=new HashSet<String>();
        hashString.add("Cat");
        hashString.add("Dog");
        hashString.add("Wolf");
        hashString.add("Tiger");
        hashString.add("Lion");
        //hashString.forEach((n)-> System.out.println(n));
        for(String i:hashString){
            System.out.println(i);

        }
    }
}

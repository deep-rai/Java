package HashSet.Exercise2;

import java.util.HashSet;
import java.util.Iterator;

public class HashIterator {
    public void loopHashSet(){
        HashSet<String> hashString=new HashSet<String>();
        hashString.add("Apple");
        hashString.add("Orange");
        hashString.add("Grapes");
        hashString.add("Lemon");
        hashString.add("Tomato");
        hashString.add("Weak");
        Iterator loopHash= hashString.iterator();
        while(loopHash.hasNext()) {
            System.out.println(loopHash.next());
        }
    }
}

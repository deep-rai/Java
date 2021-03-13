package ArrayList.Exercise4;

import java.util.ArrayList;

public class GetSet {
    public void list(){
        ArrayList<String> arrList=new ArrayList<String>();
        arrList.add("0 index ");
        arrList.add("1st index ");
        arrList.add("2nd index ");
        arrList.add("3rd index ");
        arrList.add("4th index ");
        arrList.add("5th index ");
        //get method
        System.out.println(arrList.get(1));//this will return the value at index 1
        System.out.println(arrList.get(4));//this will return the value at index 4
        System.out.println();
        //set method
        System.out.println("The whole list ");
        arrList.forEach((a)-> System.out.print(a+" ,"));
        System.out.println();
        System.out.println("Use of set ");
        arrList.set(1,"Updated 1st index");
        arrList.set(2,"Updated 2nd index");
        arrList.forEach((a)-> System.out.print(a+" ,"));
    }
}

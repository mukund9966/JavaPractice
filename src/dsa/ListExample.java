package dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("muku");
        arrayList.add("naku");
        arrayList.add("sara");

        arrayList.remove("sara");
        
        
        System.out.println("ArrayList:");
        for (String element : arrayList) {
            System.out.println(element);
        }

        List<String> linkedList = new LinkedList<>();
        linkedList.add("qwer");
        linkedList.add("qwerty");
        linkedList.add("asdfg");

        linkedList.remove("asdfg");

        

        System.out.println("LinkedList:");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}


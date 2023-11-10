package dsa;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
		        Set<String> set = new HashSet<>();
		
		        
		        set.add("Muku");
		        set.add("Nakul");
		        set.add("Saransh");
		
		
		        set.remove("Nakul");
		
		
		        for (String element : set) {
		            System.out.println(element);
		        }
        

      
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add("Muku");
                hashSet.add("Nakul");
                hashSet.add("Saransh");

                hashSet.remove("Nakul");

                LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
                linkedHashSet.add("muku");
                linkedHashSet.add("sara");
                linkedHashSet.add("shivang");

                linkedHashSet.remove("muku");

                TreeSet<String> treeSet = new TreeSet<>();
                treeSet.add("qwer");
                treeSet.add("asdf");
                treeSet.add("zxcv");

                treeSet.remove("asdf");

                System.out.println("HashSet: " + hashSet);
                System.out.println("LinkedHashSet: " + linkedHashSet);
                System.out.println("TreeSet: " + treeSet);
            
        
    }
}
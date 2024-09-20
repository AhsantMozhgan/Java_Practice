import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class ArrayListTest {
    public static void main(String[] args) {
//        ArrayList names = new ArrayList(3); // if we have more than 3 elements the ArrayList capacity will double
//        ArrayList<String> names = new ArrayList<String>(3); // we need to declare data type of the names

        // OR
//        size of  this Array list is 0 and its capacity is 3
        ArrayList<String> names = new ArrayList(3); // we can omit the second <String>

        // to add an element to ArrayList we have two methods: add(object element) and add(int index, object element)
        // add(object element) will add element to the last
        // add(int index, object element) will add element to a specified index that we want
        System.out.println(names);      // []
//        names.add(12); // error because the data type is declared as String
        names.add("Ali");
        names.add("Naghi");
        names.add("Abbas");
        names.add("Taghi");
        System.out.println(names);  // names will add from end of the ArrayList in order        // [Ali, Naghi, Abbas, Taghi]
        Collections.sort(names);    // must import Collections class
        System.out.println(names);

        names.add(1, "Jafar");  // add element to index 1       // [Abbas, Jafar, Ali, Naghi, Taghi]
        System.out.println(names);

        System.out.println(names.get(2));       // Ali      // get() method does not show as bracket []

        // capacity here is 3 but the number of elements is 5
        System.out.println(names.size());

        // show elements from left to right
        for (int i = 0; i < names.size(); i++) {
            // show each element in one line
            System.out.println(names.get(i));
        }

        // OR
        // show elements from left to right
        for (String name : names) {     // this 'for' cant show from right to left
            System.out.println(name);
        }

        // show elements from right to left
        // the last element in Array List is 'size() - 1'
        for (int i = names.size() - 1; i >= 0; i--) {
            // show each element in one line
            System.out.println(names.get(i));
        }
        names.clear();
        names.add("Ehsan");
        names.add("Mohsen");
        System.out.println(names);
        names.set(0, "Money");
        System.out.println(names);

        names.clear();
        names.add("Ali");
        names.add("Taghi");
        names.add("Abbas");
        names.add("Taghi");
        System.out.println(names);
//        names.remove(2);
//        System.out.println(names);

        System.out.println(names.indexOf("Taghi"));
        System.out.println(names.lastIndexOf("Taghi"));
//        names.clear();
//        System.out.println(names);

        // searching an element in the ArrayList
        if (names.indexOf("Taghi") != -1) {
            System.out.println("Taghi Exists");
        }

        // searching an element in the ArrayList
        if (names.indexOf("Jafar") != -1) {
            System.out.println("Jafar Exists");
        }
        // OR
        if (names.contains("Jafar")) {
            System.out.println("Jafar Exists");
        }

        // Vector
        // it is better to do not use Vector and istead use ArrayList
//        Vector<String> names2 = new Vector(3);
        Vector<String> names2 = new Vector(3, 4);
        names2.add("Maryam");
        names2.add("Mohsen");
        names2.add("Mina");
        System.out.println("current capacity: " + names2.capacity());  // 'capacity()' shows the current capacity.      // 3
        System.out.println("current size: " + names2.size());       // 3

        // using 'Vector<String> names2 = new Vector(3, 4);' instead of 'Vector<String> names2 = new Vector(3);'
        names2.add("Ben");
        System.out.println("current capacity: " + names2.capacity());  // 'capacity()' shows the current capacity.      // 7
        System.out.println("current size: " + names2.size());       // 4
    }
}

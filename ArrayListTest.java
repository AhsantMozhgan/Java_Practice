import java.util.ArrayList;
import java.util.Collections;

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
    }
}

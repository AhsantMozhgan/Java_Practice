import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("1.txt");
        System.out.println(file.exists());      // true
        System.out.println(file.isDirectory());      // false

        System.out.println(file.getAbsoluteFile());     // this method returns the Address of file
        System.out.println(file.getName());     // 1.txt
        System.out.println(file.getParent());   // null
        System.out.println(file.length());      // 15       // each character is 1 byte, also each character in Farsi is 2 byte

        File file1 = new File("testPackage");   // we put directory (folder name) here
        String [] names = file1.list();
        for (String name: names) {
            // Returns an array of Strings representing a directory's contents (folder's contents). Returns null if the File object does not represent a directory.
            System.out.println(name);
        }
    }
}

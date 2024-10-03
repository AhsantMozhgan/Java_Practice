import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
//        File file = new File("1.txt");
//        System.out.println(file.exists());      // true
//        System.out.println(file.isDirectory());      // false
//
//        System.out.println(file.getAbsoluteFile());     // this method returns the Address of file
//        System.out.println(file.getName());     // 1.txt
//        System.out.println(file.getParent());   // null
//        System.out.println(file.length());      // 15       // each character is 1 byte, also each character in Farsi is 2 byte
//
//        File file1 = new File("testPackage");   // we put directory (folder name) here
//        String [] names = file1.list();
//        for (String name: names) {
//            // Returns an array of Strings representing a directory's contents (folder's contents). Returns null if the File object does not represent a directory.
//            System.out.println(name);
//        }


//        System.out.println(file.exists());       // true
//        System.out.println(file.delete());       // true        // '1.txt' will delete
//        System.out.println(file.delete());       // false       // '1.txt' is deleted
//
//        File file2 = new File("x");
//        System.out.println(file2.exists());      // false
//        System.out.println(file2.delete());      // false  // this is like shift+delete


//        file.createNewFile();
//        System.out.println(file.createNewFile());       // false

//        File createFile = new File("$123");
//        File createFile1 = new File("?1234");     // true       // // it will create this file "$1234"
//
//        createFile.createNewFile();
//        System.out.println(createFile.createNewFile());
//        System.out.println(createFile1.createNewFile());        // true

//        File createDirectory = new File("newDirectory");
//        System.out.println(createDirectory.mkdir());  // will create new folder in the path that you are

//        File createNestedDirectory = new File("z\\t\\y");
//        System.out.println(createNestedDirectory.mkdirs()); // create several nested folders in the path that you are

//        File file = new File("y");
//        System.out.println(file.mkdirs());

        File file = new File("z\\t\\y");
        System.out.println(file.mkdirs());


    }
}

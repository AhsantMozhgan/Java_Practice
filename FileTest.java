import java.io.*;
import java.util.Scanner;

public class FileTest {
//    public static void main(String[] args) throws IOException {
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

    public static void main(String[] args) {        // when we delete 'throws IOException' we have error in here: FileWriter writer = new FileWriter("1.txt");
//        File file = new File("z\\t\\y");
//        System.out.println(file.mkdirs());
//        FileWriter writer = new FileWriter("1.txt");
//        try {
//            FileWriter writer = new FileWriter("1.txt");
//        } catch (IOException e) {
//            System.out.println("An error occurred");    // file '1.txt' was already created and had some text in it, and 'FileWriter' will delete all the texts that was inside the '1.txt'
//        }

//        try {
//            FileWriter writer = new FileWriter("11.txt");
//        } catch (IOException e) {
//            System.out.println("An error occurred");       // create new file named '11.txt'
//        }

        // write this text: "write new text into 1.txt file" inside the '1.txt'
//        try {
//            FileWriter writer = new FileWriter("1.txt", true);
//            writer.write("write new text into 1.txt file"); // 'write new text' will not write inside the '1.txt' file because we didn't close it
//            writer.close();
//        } catch (IOException e) {
//            System.out.println("An error occurred");    // file '1.txt' was already created and had some text in it, and 'FileWriter' will not delete all the texts that was inside the '1.txt'
//        }


        // we want to write everything that user will enter
        Scanner reader = new Scanner(System.in);

//        try {
//            FileWriter writer = new FileWriter("1.txt", true);
//            String str = reader.nextLine();
//            while (!str.equals("finish")) {
//                writer.write(str + '\n');
//                str = reader.nextLine();    // if we do not write this code, it will read the first line and will write it forever
//            }
//            writer.close();
//        }  catch (IOException e) {
//            System.out.println("An error occurred");    // file '1.txt' was already created and had some text in it, and 'FileWriter' will not delete all the texts that was inside the '1.txt'
//        }

//        // we can also use PrintWriter class
//        try {
////            PrintWriter writer2 = new PrintWriter("1.txt");  // the text inside the file will get empty
//
//            // file '1.txt' was already created and had some text in it, and 'PrintWriter' will not delete all the texts that was inside the '1.txt' (by using FileWriter)
//            FileWriter writer1 = new FileWriter("1.txt", true);
//            PrintWriter writer2 = new PrintWriter(writer1);  // now the text inside the file will not get empty
//
//            String str = reader.nextLine();
//            while (!str.equals("finish")) {
//                writer2.println(str + '\n');
//                str = reader.nextLine();    // if we do not write this code, it will read the first line and will write it forever
//            }
//            writer2.close();
//        }  catch (IOException e) {
//            System.out.println("An error occurred");    // file '1.txt' was already created and had some text in it, and 'FileWriter' will not delete all the texts that was inside the '1.txt'
//        }

        // for reading from file

        try {
            //        File f = new File("1.txt");
            Scanner reader1 = new Scanner(new File("scores.txt"));
            while (reader1.hasNext()) {
                String studentInfo = reader1.nextLine();
                System.out.println(studentInfo);
            }
        } catch (FileNotFoundException ex)  {
            System.out.println("File doesn't exist");

        }

    }
}

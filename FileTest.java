import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("1.txt");
        System.out.println(file.exists());      // true
        System.out.println(file.isDirectory());      // false

        System.out.println(file.getAbsoluteFile());     // this method returns the Address of file
    }
}

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("1.txt");
        System.out.println(file.exists());      // true
    }
}
 
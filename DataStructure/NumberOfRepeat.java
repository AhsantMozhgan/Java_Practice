package DataStructure;

public class NumberOfRepeat {
    public static void main(String[] args) {
        int N = 5;
        int x = 0;
        for(int i = 1; i <= N; i++)             // from 1 to n
            for (int j = 0; j < N; j++) {       // from 0 to n-1
                System.out.println("i=" + i + " j=" + j);
                x++;
                System.out.println("x is: " + x);       // x is: 25
            }
    }
}

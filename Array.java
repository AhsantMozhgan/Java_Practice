public class Array {
    public static void main(String[] args) {
//        int x, y, z, b, c;

        int [] a = new int[5];      // OR int x, y, z, b, c;
        System.out.print("   " + a[0]);
        System.out.print("   " + a[1]);
        System.out.print("   " + a[2]);
        System.out.print("   " + a[3]);
        System.out.print("   " + a[4]);

        System.out.println();

        for (int i = 0; i < a.length; i++) {    // for (int = 0; i < 5; i++)
            System.out.print("   " + a[i]);
        }

        System.out.println();

        int x, y, z;
//        int [] a;
        a[2] = a[0] + a[1];     // z = x + y
        System.out.println(a[2]);

        System.out.println();

        int d [] =new int[5];
        d[0] = 2;
        d[0] = 5;
        d[0] = 7;
        d[0] = 11;
        d[0] = 15;

//        int [] d = {2, 5, 7 , 11, 15};    //OR


    }
}

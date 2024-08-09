public class ArrayCopy {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4};
        // incorrect copying
        int [] b = a; // Important Note: This does not create a new array; instead, b now references the same array in memory that a references.
        System.out.println(a);
        System.out.println(b);
        System.out.println();

        // correct copying
        int [] sourceArray = {1, 2, 3, 4};
        int [] targetArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length;i++) {
            targetArray[i] = sourceArray[i];

            // OR
//            Use the static arraycopy method in the System class.
//            arraycopy(sourceArray, src_pos, targetArray, tar_pos, length);
            System.arraycopy (sourceArray, 0, targetArray, 0, sourceArray.length);
            System.out.println(sourceArray);
            System.out.println(targetArray);

        }
    }
}

package testPackage;

public class B {
    public static void main(String[] args) {
        A a2 = new A();
//        a2.a = 2;   // error (private access)
        a2.b = 2;    // public access
        a2.c = 2;     // default access
    }
}

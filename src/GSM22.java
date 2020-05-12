import gsm.poly.*;

public class GSM22 {
    public static void main(String[] args) {
        Object obj = new A();
        ((A) obj).ptr();

        obj = new B();
        ((B) obj).ptr();

        A a = new A();
        B b = new B();

        display(a);
        display(b);
    }

    public static void display(Object obj) {
        if (obj instanceof A) {
            ((A) obj).ptr();
        } else if (obj instanceof B) {
            ((B) obj).ptr();
        }
    }
}

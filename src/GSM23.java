import gsm.poly.*;

public class GSM23 {
    public static void main(String[] args) {
        Object[] objs = {new A(), new B()};

        for (Object obj: objs) {
            if (obj instanceof A) ((A) obj).ptr();
            else ((B) obj).ptr();
        }
    }
}

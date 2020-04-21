import gsm.util.MyUtil;
import java.lang.*;

public class GSM09 {
    public static void main(String[] args) {
        int v = MyUtil.hap(1, 2);
        System.out.println(v);

        MyUtil my = new MyUtil();
        float f = my.hap(12.3f, 45.6f);
        System.out.println(f);

        String a = "100";
        String b = "200";

        int ai = Integer.parseInt(a);
        int bi = Integer.parseInt(b);

        System.out.println(ai + bi);
    }
}

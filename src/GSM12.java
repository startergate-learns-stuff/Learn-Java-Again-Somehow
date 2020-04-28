import gsm.util.IntArray;

import java.util.ArrayList;

public class GSM12 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(3220);
        for (int i = 0; i < 6; i++) {
            arr.add((int)(Math.random() * 10));
        }

        for (Object value : arr) {
            System.out.println((int) value);
        }
    }
}

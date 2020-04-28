import gsm.util.FloatArray;

public class GSM13 {
    public static void main(String[] args) {
        FloatArray arr = new FloatArray();
        arr.add(3220);
        for (int i = 0; i < 6; i++) {
            arr.add((float)(Math.random() * 100));
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}

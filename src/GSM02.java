public class GSM02 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        int[] b = { 4, 3, 1, 2, 5 };
        for (int i: b) {
            if (i % 2 == 0) System.out.println(i);
        }

        int even = 0;
        int odd = 0;

        for (int v: b) {
            if (v % 2 == 0) even += v;
            else odd += v;
        }
        System.out.println(even - odd);
    }
}

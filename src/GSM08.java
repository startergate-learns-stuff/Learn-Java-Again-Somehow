public class GSM08 {
    public static void main(String[] args) {
        System.out.println(twoHap(1, 100));
    }

    public static int total(int a, int b) {
        return a + b;
    }

    public static int twoHap(int start, int end) {
        int total = 0;
        for (int i = start; i <= end; i++) {
            total += i;
        }

        return total;
    }
}

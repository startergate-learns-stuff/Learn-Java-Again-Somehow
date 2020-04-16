public class Start {
    public static void main(String[] args) {
        System.out.println("hello world");

        int a;
        a = 10;
        System.out.println(a);

        float b = (float) 34.5;
        System.out.println(b);

        char c = 'A';
        System.out.println(c);

        int cc = 'A' + 1;
        System.out.println(cc);
        System.out.println((char)cc);
        System.out.println((char)'A'+1);
        System.out.println('1' + '1');

        int z = '1';
        int y = '1';
        int v = z + y - '0' * 2;
        System.out.println("최호승: " + v);
    }
}

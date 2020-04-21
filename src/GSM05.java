public class GSM05 {
    public static void main(String[] args) {
        SungJeuk sj = new SungJeuk();
        System.out.println(sj.b_num);
        System.out.println(sj.b_ban);
        System.out.println(sj.kor);
        System.out.println(sj.eng);

        SungJeuk sj2 = new SungJeuk(3220, 2, 100f, 100f);
        System.out.println(sj2.b_num);
        System.out.println(sj2.b_ban);
        System.out.println(sj2.kor);
        System.out.println(sj2.eng);
    }
}

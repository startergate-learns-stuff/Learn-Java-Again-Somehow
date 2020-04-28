import gsm.util.MovieArray;
import gsm.util.MovieVO;

public class GSM14 {
    public static void main(String[] args) {
        MovieArray arr = new MovieArray(3);

        arr.add(new MovieVO("어벤저스 엔드게임", "루소 형제", 10000, 12));
        arr.add(new MovieVO("TENET", "크리스토퍼 놀란", 10000, 15));
        arr.add(new MovieVO("GSM 연대기", "최호승", 10000, 18));

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}

package gsm.util;

public class MovieArray {
    private MovieVO[] arr;

    private int cnt = 0;

    public MovieArray() {
        this(10);
    }

    public MovieArray(int initial) {
        arr = new MovieVO[initial];
    }

    public void add(MovieVO value) {
        arr[cnt++] = value;
    }

    public MovieVO get(int index) {
        return arr[index];
    }

    public int size() {
        return cnt;
    }
}

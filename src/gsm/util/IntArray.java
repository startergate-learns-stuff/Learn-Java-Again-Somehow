package gsm.util;

public class IntArray {
    private int[] arr;

    private int cnt = 0;

    public IntArray() {
        this(10);
    }

    public IntArray(int initial) {
        arr = new int[initial];
    }

    public void add(int value) {
        arr[cnt++] = value;
    }

    public int get(int index) {
        return arr[index];
    }

    public int size() {
        return cnt;
    }
}

package gsm.util;

public class FloatArray {
    private float[] arr;

    private int cnt = 0;

    public FloatArray() {
        this(10);
    }

    public FloatArray(int initial) {
        arr = new float[initial];
    }

    public void add(float value) {
        arr[cnt++] = value;
    }

    public float get(int index) {
        return arr[index];
    }

    public int size() {
        return cnt;
    }
}

package gsm.poly;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("댕댕이가 먹는다!");
    }

    @Override
    public void move() {
        System.out.println("개가 무리지어 움직인다!");
    }
}

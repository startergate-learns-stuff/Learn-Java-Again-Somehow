package gsm.poly;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("냥이가 먹는다!");
    }

    public void night() {
        System.out.println("냥이-빔.");
    }

    @Override
    public void move() {
        System.out.println("냥이가 움직인다!");
    }
}

import gsm.poly.*;

public class GSM19 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.move();

        Animal cat = new Cat();
        cat.eat();
        cat.move();
        ((Cat) cat).night();
    }
}

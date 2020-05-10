import gsm.poly.Animal;
import gsm.poly.Cat;
import gsm.poly.Dog;

public class GSM17 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.night();
        cat.move();

        Dog dog = new Dog();
        dog.eat();
        dog.move();
    }
}

import gsm.poly.Animal;
import gsm.poly.Cat;
import gsm.poly.Dog;

public class GSM18 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.eat();
        cat.move();

        Animal dog = new Dog();
        dog.eat();
        dog.move();
    }
}

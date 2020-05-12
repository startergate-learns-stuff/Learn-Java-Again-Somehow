import gsm.poly.*;

public class GSM21 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat()};

        for (Animal animal: animals) {
            animal.eat();
            animal.move();
            if (animal instanceof Cat) {
                ((Cat) animal).night();
            }
        }
    }
}

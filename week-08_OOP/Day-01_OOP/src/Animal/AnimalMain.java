package Animal;

public class AnimalMain {
    public static void main(String[] args) {
        Animal pig = new Animal();

        System.out.println(pig.hunger);
        pig.play();
        System.out.println(pig.thirst);
        pig.eat();
        pig.drink();

        for (int i = 0; i < 50; i++) {
            pig.drink();
        }

        System.out.println(pig.thirst);


    }
}

package Animal;

public class Animal {
    int hunger;
    int thirst;
    boolean isAlive;

    public Animal() {
    this(50,50, true);
    }

    public Animal(int hunger, int thirst, boolean isAlive) {
        this.hunger = hunger;
        this.thirst = thirst;
        this.isAlive = true;
    }

    public void eat() {
        this.hunger --;
    }

    public void drink() {
        this.thirst --;
        this.diedOfThirst();
    }

    public void play() {
        this.hunger ++;
        this.thirst ++;
    }

    public void diedOfThirst() {
        if (this.thirst <= 0) {
            this.isAlive = false;
            System.out.println("Sorry, your animal is dead");
        }
     }


    //Create an Animal class
    //Every animal has a hunger value, which is a whole number
    //Every animal has a thirst value, which is a whole number
    //when creating a new animal object these values are created with the default 50 value
    //Every animal can eat() which decreases their hunger by one
    //Every animal can drink() which decreases their thirst by one
    //Every animal can play() which increases both by one


}

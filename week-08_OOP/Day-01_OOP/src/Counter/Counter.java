package Counter;

    //Counter
    //Create Counter class
public class Counter {

    //which has an integer field value
    int number;
    int reset;

    //when creating it should have a default value 0 or we can specify it when creating
    public Counter() {
        this.number = 0;
    }

        public Counter(int number) {
            this.number = number;
            this.reset = number;
        }

        //we can add(number) to this counter another whole number
    public void add (int numberToAdd) {
        number = this.number + numberToAdd;
    }

    //or we can add() without parameters just increasing the counter's value by one
    public void add () {
        this.number ++;
    }
    //and we can get() the current value
    public int get() {
        return this.number;
    }

    //also we can reset() the value to the initial value
    public int reset() {
        this.number = reset;
        return number;
    }

    //Check if everything is working fine with the proper test
    //Download CounterTest.java and place it next to your solution
    //If something's red in it, ALT+Enter Add JUnit5 to classpath (5 aka JUnit FIVE not 4 or 3)
    //Then run the tests with the green play button before the lines (run all of them before the classname)
}

import java.util.ArrayList;
import java.util.List;

public class Domino implements Printable {

    int leftSide;
    int rightSide;

    public Domino(int leftSide, int rightSide) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }


    public void printAllFields() {
        System.out.printf("%s A side: %d, B side: %d\n", this.getClass().getSimpleName(), leftSide, rightSide);
    }

}

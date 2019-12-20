public class Trapezoid extends Quadrangle implements HasParallelSidePair {

    @Override
    public void whatAmI() {
        System.out.println("\nI am a trapezoid.");
    }

    @Override
    public void whyAmISpecial() {
        this.haveParallelSidePairs();
    }

    @Override
    public void haveParallelSidePairs() {
        System.out.println("I have two sides opposite each other that are parallel.");
    }
}
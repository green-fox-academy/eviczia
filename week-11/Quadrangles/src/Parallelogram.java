public class Parallelogram extends Trapezoid implements HasTwoParallelSidePairs {

    @Override
    public void whatAmI() {
        System.out.println("\nI am a parallelogram.");
    }

    @Override
    public void whyAmISpecial() {
        super.whyAmISpecial();
        this.haveTwoParallelSidePairs();
    }

    @Override
    public void haveParallelSidePairs() {
        System.out.println("I have two sides opposite each other that are parallel.");
    }

    @Override
    public void haveTwoParallelSidePairs() {
        System.out.println("In fact, all my sides are parallel with the side opposite.");
    }
}
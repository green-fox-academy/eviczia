public class Rhombus extends Parallelogram implements AllSidesEqual{

    @Override
    public void whatAmI() {
        System.out.println("\nI am a rhombus.");
    }

    @Override
    public void whyAmISpecial() {
        super.whyAmISpecial();
        this.twoNeighboringSidePairsAreEqual();
        this.haveFourEqualSides();
    }

    @Override
    public void haveFourEqualSides() {
        System.out.println("I have four equal sides.");
    }

    @Override
    public void twoNeighboringSidePairsAreEqual() {
        System.out.println("Every one of my sides has a neighbour that is the same size.");
    }
}
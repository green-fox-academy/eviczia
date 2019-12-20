public class Square extends Rhombus implements AllFourRightAngles {

    @Override
    public void whatAmI() {
        System.out.println("\nI am a square.");
    }

    @Override
    public void whyAmISpecial() {
        super.whyAmISpecial();
        this.haveFourRightAngles();
//        this.twoNeighboringSidePairsAreEqual();
    }

    @Override
    public void twoNeighboringSidePairsAreEqual() {
        System.out.println("Every one of my sides has a neighbour that is the same size");
    }

    @Override
    public void haveFourRightAngles() {
        System.out.println("I have four right angles.");
    }

}
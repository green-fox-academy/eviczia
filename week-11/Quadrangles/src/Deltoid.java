public class Deltoid extends Quadrangle implements TwoNeighboringSidePairsEqual {

    public Deltoid() {
    }

    @Override
    public void whatAmI() {
        System.out.println("\nI am a deltoid.");
    }

    @Override
    public void whyAmISpecial() {
        this.twoNeighboringSidePairsAreEqual();
    }

    @Override
    public void twoNeighboringSidePairsAreEqual() {
        System.out.println("Every one of my sides has a neighbour that is the same size.");
    }
}
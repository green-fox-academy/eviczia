public class Rectangle extends Parallelogram implements AllFourRightAngles {

    @Override
    public void whatAmI() {
        System.out.println("\nI am a rectangle.");
    }

    @Override
    public void whyAmISpecial() {
        super.whyAmISpecial();
        this.haveFourRightAngles();
    }

    @Override
    public void haveFourRightAngles() {
        System.out.println("I have four right angles.");
    }

}

import java.util.ArrayList;
import java.util.List;

public class Quadrangles {

    private List<Quadrangle> myQuadrangles;


    public Quadrangles() {
        myQuadrangles = new ArrayList<>();
        myQuadrangles.add(new Deltoid());
        myQuadrangles.add(new Parallelogram());
        myQuadrangles.add(new Rectangle());
        myQuadrangles.add(new Rhombus());
        myQuadrangles.add(new Square());
        myQuadrangles.add(new Trapezoid());
    }

    public void introduce() {
        for (Quadrangle shape: myQuadrangles) {
            shape.whatAmI();
            shape.whyAmISpecial();
        }
    }
}

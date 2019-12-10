public class Quadrangle {

    private int aSide;
    private int bSide;

    private int abAngle;
    private int bcAngle;
    private int cdAngle;

    public Quadrangle(int aSide, int bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
    }

    public int getASide() {
        return aSide;
    }

    public void setASide(int aSide) {
        this.aSide = aSide;
    }

    public int getBSide() {
        return bSide;
    }

    public void setBSide(int bSide) {
        this.bSide = bSide;
    }

    public int getabAngle() {
        return abAngle;
    }

    public void setabAngle(int abAngle) {
        if (abAngle + bcAngle + cdAngle < 360) {
            this.abAngle = abAngle;
        }
    }

    public int getbcAngle() {
        return bcAngle;
    }

    public void setbcAngle(int bcAngle) {
        if (abAngle + bcAngle + cdAngle < 360) {
            this.bcAngle = bcAngle;
        }
    }

    public int getcdAngle() {
        return cdAngle;
    }

    public void setcdAngle(int cdAngle) {
        if (abAngle + bcAngle + cdAngle < 360) {
            this.cdAngle = cdAngle;
        }
    }

    public int getdaAngle() {
        return 360 - abAngle - bcAngle - cdAngle;
    }

    double calculateArea();

    double calculateCircumference();

}

public class F16 extends Aircraft {

    public static final int MAX_AMMO = 8;
    public static final int BASE_DAMAGE = 30;


    public F16() {
        super(MAX_AMMO, BASE_DAMAGE);
        super.setPriority(false);
    }

    @Override
    public int refill(int ammoRefill) {
        return super.refill(ammoRefill);
    }

}

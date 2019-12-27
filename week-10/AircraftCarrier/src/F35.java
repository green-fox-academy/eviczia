public class F35 extends Aircraft {

    public static final int MAX_AMMO = 12;
    public static final int BASE_DAMAGE = 50;


    public F35() {
        super(MAX_AMMO, BASE_DAMAGE);
        super.setPriority(true);
    }

}

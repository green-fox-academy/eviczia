public class ZeroAmmoException extends Throwable {

    public ZeroAmmoException() {
        System.err.println("Unable to refill: ammo storage empty");
    }


}

public class Main {

    public static void main(String[] args) {

        F16 f16_1 = new F16();
        F35 f35_1 = new F35();

        System.out.println(f16_1.getStatus());
        System.out.println(f35_1.getStatus());

        f16_1.refill(13);
        System.out.println(f16_1.getStatus());
        System.out.println(f35_1.getStatus());

        f16_1.setAmmoSupply(31);
        System.out.println(f16_1.getAmmoSupply());


        f16_1.fight();
        System.out.println(f16_1.getStatus());
        System.out.println(f35_1.getStatus());


    }
}

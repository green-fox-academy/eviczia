public class BandiNumberAdder {
    public static void main(String[] args) {
        int meddig = 10;
        int osszeg = 0;
        int kesz = szamolo(meddig, osszeg);
        System.out.println(kesz);

    }

    private static int szamolo(int meddig, int osszeg) {

        if (meddig == 0) {
            return osszeg;
        } else {
            osszeg = osszeg + meddig;
            System.out.println(szamolo(meddig-1, osszeg));

        }
        return osszeg;
    }
}

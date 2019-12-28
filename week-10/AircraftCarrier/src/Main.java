public class Main {

    public static void main(String[] args) {

        Carrier friendlyCarrier = new Carrier(2500, 5000);
        Carrier enemyCarrier = new Carrier(2500, 5000);

        fillCarrier(friendlyCarrier);
        fillCarrier(enemyCarrier);

        System.out.println(friendlyCarrier.getStatus());
        System.out.println(enemyCarrier.getStatus());

        friendlyCarrier.fill();
        enemyCarrier.fill();

        enemyCarrier.fight(friendlyCarrier);
        friendlyCarrier.fight(enemyCarrier);

        enemyCarrier.fight(friendlyCarrier);
        friendlyCarrier.fight(enemyCarrier);
        enemyCarrier.fight(friendlyCarrier);
        friendlyCarrier.fight(enemyCarrier);
        enemyCarrier.fight(friendlyCarrier);
        friendlyCarrier.fight(enemyCarrier);
        enemyCarrier.fight(friendlyCarrier);
        friendlyCarrier.fight(enemyCarrier);
        enemyCarrier.fight(friendlyCarrier);
        friendlyCarrier.fight(enemyCarrier);
        enemyCarrier.fight(friendlyCarrier);
        friendlyCarrier.fight(enemyCarrier);
        enemyCarrier.fight(friendlyCarrier);
        friendlyCarrier.fight(enemyCarrier);
        enemyCarrier.fight(friendlyCarrier);
        friendlyCarrier.fight(enemyCarrier);
        enemyCarrier.fight(friendlyCarrier);
        friendlyCarrier.fight(enemyCarrier);
        enemyCarrier.fight(friendlyCarrier);
        friendlyCarrier.fight(enemyCarrier);


        System.out.println(friendlyCarrier.getStatus());
        System.out.println(enemyCarrier.getStatus());

    }

    private static void fillCarrier(Carrier carrier) {
        for (int i = 0; i < (int) (Math.random()*10 + 5); i++) {
            if ((int)(Math.random()*2) == 0) {
                carrier.add(new F16());
            } else {
                carrier.add(new F35());
            }
        }

    }
}

package PetrolStation;

public class PetrolStationMain {
    public static void main(String[] args) {
        Car ford = new Car(0, 100);
        Station omv = new Station(7000);

        System.out.println(ford.gasAmount + " " + ford.capacity + " " + omv.gasAmount);
        omv.refill(ford);
        System.out.println(ford.gasAmount + " " + ford.capacity + " " + omv.gasAmount);


    }



}

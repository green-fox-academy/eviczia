public class GardenApplication {
    public static void main(String[] args) {

        Garden myGarden = new Garden();

        Flower daffodil = new Flower("yellow");
        Flower violet = new Flower("blue");

        Tree plumTree = new Tree("purple");
        Tree orangeTree = new Tree("orange");

        myGarden.addPlant(daffodil);
        myGarden.addPlant(violet);
        myGarden.addPlant(plumTree);
        myGarden.addPlant(orangeTree);

        myGarden.showGarden();
        myGarden.waterPlants(40);
        myGarden.showGarden();
        myGarden.waterPlants(70);
        myGarden.showGarden();
    }
}

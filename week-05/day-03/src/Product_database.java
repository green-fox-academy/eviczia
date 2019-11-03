import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Product_database {
    // We are going to represent our products in a map where the keys are strings representing
    // the product's name and the values are numbers representing the product's price.
    //
    public static void main(String[] args) {

    //Create a map with the following key-value pairs.
        HashMap<String, Integer> priceList = new HashMap<>();
        priceList.put("Eggs", 200);
        priceList.put("Milk", 200);
        priceList.put("Fish", 400);
        priceList.put("Apples", 150);
        priceList.put("Bread", 50);
        priceList.put("Chicken", 550);

        System.out.println("0. " + priceList);
    //0. {Apples=150, Fish=400, Chicken=550, Eggs=200, Milk=200, Bread=50}

    //Create an application which solves the following problems.
    //
    //How much is the fish?
        String item= "Fish";
        System.out.print("1. ");
        priceOf(priceList, item);
    //1. The price of Fish is 400

    //What is the most expensive product?
        System.out.print("2. ");
        mostExp(priceList);
    //2. The most expensive item: Chicken

    //What is the average price?
        System.out.print("3. ");
        average(priceList);
    //3. The average price is 258

    //How many products' price is below 300?
        Integer limit = 300;
        System.out.print("4. ");
        belowLimit(priceList, limit);
    //4. There are 4 items below 300

    //Is there anything we can buy for exactly 125?
        Integer spend = 125;
        System.out.print("5. ");
        forInt(priceList, spend);
    //5. That's all.

    //What is the cheapest product?
        System.out.print("6. ");
        cheapest(priceList);
    //6. The cheapest item: Bread
    }

    private static void forInt(HashMap<String, Integer> priceList, Integer money) {
        for (Map.Entry <String, Integer> itemPrice: priceList.entrySet()) {
            if (itemPrice.getValue().equals(money)) {
                System.out.printf("You can buy %s for %d.", itemPrice.getKey(), itemPrice.getValue());
            }
        }
        System.out.println("That's all.");
    }

    private static void belowLimit(HashMap<String, Integer> priceList, Integer limit) {
        int numberBelow = 0;
        for (Map.Entry <String, Integer> itemPrice: priceList.entrySet()) {
            if (itemPrice.getValue() < limit) {
            numberBelow += 1;
            }
        }
        System.out.printf("There are %d items below %d\n", numberBelow, limit);
    }

    private static void cheapest(HashMap<String, Integer> priceList) {
        Integer min = 100000;
        String cheapest = "thing";
        for (Map.Entry<String, Integer> itemPrice : priceList.entrySet()) {
            if (itemPrice.getValue() < min) {
                min = itemPrice.getValue();
                cheapest = itemPrice.getKey();
            }
        }
        System.out.println("The cheapest item: " + cheapest);
    }


    private static void average(HashMap<String, Integer> priceList) {
        int sum = 0;
        int sizeHM = priceList.size();
        for (Map.Entry<String, Integer> itemPrice : priceList.entrySet()) {
            sum += itemPrice.getValue();
        }
        System.out.println("The average price is " + (sum/sizeHM));
    }

    private static void mostExp(HashMap<String, Integer> priceList) {
        Integer max = 0;
        String mostExp = "thing";
        for (Map.Entry<String, Integer> itemPrice : priceList.entrySet()) {
            if (itemPrice.getValue() > max) {
                max = itemPrice.getValue();
                mostExp = itemPrice.getKey();
            }
        }
        System.out.println("The most expensive item: " + mostExp);
    }

    private static void priceOf(HashMap<String, Integer> priceList, String item) {
        Integer costs = priceList.get(item);
        System.out.printf("The price of %s is %d\n", item, costs);
    }
}

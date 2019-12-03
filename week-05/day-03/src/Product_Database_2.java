import java.util.HashMap;
import java.util.Map;

public class Product_Database_2 {
    //We are going to represent our products in a map where the keys are strings representing
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
        //Create an application which solves the following problems.
        //
        //Which products cost less than 201? (just the name)
        int limitLess = 201;
        System.out.printf("1. These are cheaper than %d:\n", limitLess);
        costsLessThan(priceList, limitLess);
//1. These are cheaper than 201:
//	Apples
//	Eggs
//	Milk
//	Bread

        //Which products cost more than 150? (name + price)
        int limitMore = 150;
        System.out.printf("2. These are more expensive than %d:\n", limitMore);
        costsMoreThan(priceList, limitMore);
//2. These are more expensive than 150:
//	Fish (400)
//	Chicken (550)
//	Eggs (200)
//	Milk (200)
    }

    private static void costsMoreThan(HashMap<String, Integer> priceList, int limitMore) {
        int moreExpThen = limitMore;
        for (Map.Entry<String, Integer> itemPrice : priceList.entrySet()) {
            if (itemPrice.getValue() > moreExpThen) {
                System.out.printf("\t%s (%d)\n", itemPrice.getKey(), itemPrice.getValue());
            }
        }
    }

    private static void costsLessThan(HashMap<String, Integer> priceList, int limit) {
        int cheaperThan = limit;
        for (Map.Entry<String, Integer> itemPrice : priceList.entrySet()) {
            if (itemPrice.getValue() < cheaperThan) {
                System.out.println("\t" + itemPrice.getKey());
            }
        }
    }
}

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Shopping_List_2 {
    public static void main(String[] args) {
    //Represent the following products with their prices
        HashMap<String, Float> priceList = new HashMap<>();
        priceList.put("Milk", 1.07f);
        priceList.put("Rice", 1.59f);
        priceList.put("Eggs", 3.14f);
        priceList.put("Cheese", 12.6f);
        priceList.put("Chicken Breasts", 9.40f);
        priceList.put("Apples", 2.31f);
        priceList.put("Tomato",	2.58f);
        priceList.put("Potato",	1.75f);
        priceList.put("Onion",	1.10f);

    //Represent Bob's shopping list
        HashMap<String, Integer> shoppingListBob = new HashMap<>();
        shoppingListBob.put("Milk", 3);
        shoppingListBob.put("Rice", 2);
        shoppingListBob.put("Eggs", 2);
        shoppingListBob.put("Cheese", 1);
        shoppingListBob.put("Chicken Breasts", 4);
        shoppingListBob.put("Apples", 1);
        shoppingListBob.put("Tomato", 2);
        shoppingListBob.put("Potato", 1);

    //Represent Alice's shopping list
        HashMap<String, Integer> shoppingListAlice = new HashMap<>();
        shoppingListAlice.put("Rice", 1);
        shoppingListAlice.put("Eggs", 5);
        shoppingListAlice.put("Chicken Breasts", 2);
        shoppingListAlice.put("Apples", 1);
        shoppingListAlice.put("Tomato", 10);

        //Create an application which solves the following problems.
    //
    //1. How much does Bob pay?
        System.out.printf("1. Bob pays %f\n", pays(shoppingListBob, priceList));
    //2. How much does Alice pay?
        System.out.printf("2. Alice pays %f\n", pays(shoppingListAlice,priceList));
    //3. Who buys more Rice?
        String item = "Rice";
        System.out.printf("3. %s\n", moreOf(shoppingListAlice, shoppingListBob, item));
    //4. Who buys more Potato?
        item = "Potato";
        System.out.printf("4. %s\n", moreOf(shoppingListAlice, shoppingListBob, item));
    //5. Who buys more different products?
        Integer itemsAlice = shoppingListAlice.size();
        Integer itemsBob = shoppingListBob.size();
        if (itemsAlice > itemsBob) {
            System.out.println("5. Alice buys more kinds of stuff.");
        } else if (itemsAlice < itemsBob) {
            System.out.println("5. Bob buys more kinds of stuff.");
        } else {
            System.out.println("They buy equal amount of stuff");
        }
    //6. Who buys more products? (piece)
        if (productNo(shoppingListAlice) > productNo(shoppingListBob)) {
            System.out.println("6. Alice buys more products");
        } else if (productNo(shoppingListAlice) < productNo(shoppingListBob)) {
            System.out.println("6. Bob buys more products");
        } else {
            System.out.println("6. They buy equal amount of products");
        }
    }

    private static String moreOf(HashMap<String, Integer> shoppingListAlice, HashMap<String, Integer> shoppingListBob, String item) {
        Integer itemAlice;
        Integer itemBob;
        if (shoppingListAlice.containsKey(item)) {
            itemAlice = shoppingListAlice.get(item);
        } else {
            itemAlice = 0;
        }
        if (shoppingListBob.containsKey(item)) {
            itemBob = shoppingListBob.get(item);
        } else {
            itemBob = 0;
        }

        if (itemAlice > itemBob) {
            return "Alice";
        } else if (itemAlice < itemBob) {
            return "Bob";
        } else {
            return "equals";
        }
    }

    private static Float pays(HashMap<String, Integer> list, HashMap<String, Float> prices) {
        Float total = 0f;
        for (Map.Entry<String, Integer> item:list.entrySet()) {
            total += (item.getValue()*(prices.get(item.getKey())));
        }
        return  total;
    }
    private static Integer productNo(HashMap<String, Integer> list) {
        Integer total = 0;
        for (Map.Entry<String, Integer> item:list.entrySet()) {
           total += item.getValue();
        }
        return  total;
    }


}

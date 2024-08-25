import java.util.*;

public class Sale {
    public static void sale(ArrayList<Item> inventory) {
        Iterator<Item> iterator = inventory.iterator();

        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getStatus() == 0) {
                item.setStatus(1);
                item.setPrice(item.getPrice() * 0.7);
            } else if (item.getStatus() == 1) {
                item.setStatus(2);
                item.setPrice(item.getPrice() * 0.5);
            } else {
                iterator.remove();
            }
        }
    }
}
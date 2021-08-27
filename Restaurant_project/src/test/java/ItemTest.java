import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    List<Item> item;
    Restaurant restaurant;

    public void restaurantCheck(){
        LocalTime openingTime = LocalTime.parse("10:00:00");
        LocalTime closingTime = LocalTime.parse("21:00:00");
        restaurant = new Restaurant("Chicken Palace", "Nagpur", openingTime, closingTime);
        restaurant.addToMenu("Biryani", 250);
        restaurant.addToMenu("Chicken Tikka",150);
        restaurant.addToMenu("Paneer",100);
        restaurant.addToMenu("Mutton",200);
    }

    @Test
    public void check_if_we_get_the_total_amount_after_we_add_the_multiple_items(){
        restaurantCheck();
        item = restaurant.getMenu();
        assertEquals(700,restaurant.returnsOrderValue(item));
    }

}
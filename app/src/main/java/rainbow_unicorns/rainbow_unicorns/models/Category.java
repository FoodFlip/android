package rainbow_unicorns.rainbow_unicorns.models;

import android.media.Image;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Kelsey on 8/14/16.
 */
public class Category {
    private Queue<Restaurant> restaurants;
    private int categoryCode;
    private Image image;

    //TODO add here

    public Category(int categoryCode) {

        restaurants = new LinkedList<>();

    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public Queue<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void addRestaurant(Restaurant restaurant) {
        this.getRestaurants().add(restaurant);
    }

}

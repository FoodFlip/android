package rainbow_unicorns.rainbow_unicorns.models;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Kelsey on 8/14/16.
 */
public class RestaurantCategory {
    private List<Restaurant> restaurants;
    private int categoryCode;
    private int imagePath;

    //TODO add here

    public RestaurantCategory(int categoryCode) {

        restaurants = new LinkedList<>();

    }

    public int getImagePath() {
        return imagePath;
    }

    public void setImagePath(int path) {
        this.imagePath = path;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void addRestaurant(Restaurant restaurant) {
        this.getRestaurants().add(restaurant);
    }

}

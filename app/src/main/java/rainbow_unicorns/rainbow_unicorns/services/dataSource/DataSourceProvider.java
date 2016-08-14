package rainbow_unicorns.rainbow_unicorns.services.dataSource;

import java.util.List;

import rainbow_unicorns.rainbow_unicorns.models.RestaurantCategory;

public class DataSourceProvider {

    private static DataSourceProvider dataSourceProvider;

    public static DataSourceProvider getInstance() {
        if (dataSourceProvider != null) return dataSourceProvider;
        dataSourceProvider = new DataSourceProvider();
        return dataSourceProvider;
    }

    private List<RestaurantCategory> restaurantCategories;

    public DataSourceProvider() {
    }

    public List<RestaurantCategory> getRestaurantCategories() {
        return restaurantCategories;
    }

    public void setRestaurantCategories(List<RestaurantCategory> categories) {
        this.restaurantCategories = categories;
    }
}

package rainbow_unicorns.rainbow_unicorns.components.decisions;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;

import java.util.List;

import rainbow_unicorns.rainbow_unicorns.models.RestaurantCategory;

public class RestaurantsListAdapter extends BaseExpandableListAdapter {

    private List<RestaurantCategory> categories;

    public RestaurantsListAdapter(List<RestaurantCategory> categories) {
        this.categories = categories;
    }

    @Override
    public int getGroupCount() {
        return categories.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return categories.get(i).getRestaurants().size();
    }

    @Override
    public Object getGroup(int i) {
        return categories.get(i);
    }

    @Override
    public Object getChild(int categoryIndex, int restaurantIndex) {
        return categories.get(categoryIndex).getRestaurants().get(restaurantIndex);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i * i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        return null;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        return null;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }
}

package rainbow_unicorns.rainbow_unicorns.components.decisions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import rainbow_unicorns.rainbow_unicorns.R;
import rainbow_unicorns.rainbow_unicorns.models.RestaurantCategory;
import rainbow_unicorns.rainbow_unicorns.services.dataSource.DataSourceProvider;

public class DecisionsActivity extends AppCompatActivity {
    List<RestaurantCategory> restaurantCategoryList;

    @BindView(R.id.decisionsExpandableListView)
    ExpandableListView expandableListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decisions);
        ButterKnife.bind(this);
    }

    private void init() {
        this.restaurantCategoryList = DataSourceProvider.getInstance().getRestaurantCategories();
        RestaurantsListAdapter adapter = new RestaurantsListAdapter(restaurantCategoryList);
        expandableListView.setAdapter(adapter);

        //get categories to display in list
//        for(RestaurantCategory currCat : restaurantCategoryList){
//            ExpandableListView expandableListView = (ExpandableListView) findViewById(R.id.textView3);
//            expandableListView.addView( new View() );
//            setText(currCat.getCategoryCode());
//            expandableListView.
//        }
    }
}

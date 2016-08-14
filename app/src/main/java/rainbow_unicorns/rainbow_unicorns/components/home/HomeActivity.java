package rainbow_unicorns.rainbow_unicorns.components.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.Queue;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rainbow_unicorns.rainbow_unicorns.R;
import rainbow_unicorns.rainbow_unicorns.models.Category;
import rainbow_unicorns.rainbow_unicorns.models.Restaurant;

public class HomeActivity extends AppCompatActivity {

    private ImageView appImageView;

    private ImageButton imageButton;

    private Queue<Restaurant> restaurantList;

    private Restaurant currCategory;

    private Queue<Restaurant> decisionList;

    private Queue<Category> categoryList;

    @BindView(R.id.textView)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        decisionList = new LinkedList<>();
        setAllRestaurants();

    }

    public void setAllRestaurants() {
        //TODO
        //from backend
        //loadCategories();
    }


    private void loadRestaurants() {
        restaurantList = new LinkedList<>();
        restaurantList.add(new Restaurant());
        restaurantList.add(new Restaurant());
        restaurantList.add(new Restaurant());
    }

    private void loadCategories() {
        for (Restaurant restaurant : restaurantList) {
            for (int category : restaurant.getCategories()) {

/*                if(categoryList.contains(category) ){
                    
                    restaurant.getName();
                }
                categoryMap.put( category  );*/
            }
        }
    }

    private void readData() {
        loadRestaurants();
        loadCategories();
        // get category names
        // get category pictures
    }

    private Restaurant displayRestaurant() {
        currCategory = restaurantList.peek();
        if (currCategory == null) {
            displayFinalDecision();
        } else {
            textView.setText(currCategory.getName());
        }
        return currCategory;
    }


    @OnClick(R.id.imageButtonReject)
    public void onRejectButtonClicked() {
        loadNextOption();
    }


    @OnClick(R.id.imageButtonYes)
    public void onYesButtonClicked() {
        displayRestaurant();
        storeInDecisionList();
        displayFinalDecision();
    }

    @OnClick(R.id.imageButtonMaybe)
    public void onMaybeButtonClicked() {
        displayRestaurant();
        storeInDecisionList();
        loadNextOption();
    }
    //??

    private void storeInDecisionList() {
        decisionList.add(currCategory);
    }

    private void displayFinalDecision() {
        //TODO jump to decisions activity
    }

    private void loadNextOption() {
        System.out.println("load next option");
        currCategory = restaurantList.remove();
        displayRestaurant();
    }

}

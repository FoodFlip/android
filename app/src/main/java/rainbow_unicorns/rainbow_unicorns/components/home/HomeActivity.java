package rainbow_unicorns.rainbow_unicorns.components.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.LinkedList;
import java.util.Queue;

import butterknife.OnClick;
import rainbow_unicorns.rainbow_unicorns.R;
import rainbow_unicorns.rainbow_unicorns.models.Restaurant;

public class HomeActivity extends AppCompatActivity {
    private ImageView appImageView;
    private ImageButton imageButton;
    private Queue<Restaurant> allRest;
    private Restaurant currRest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void loadAllRestaurants() {
        allRest = new LinkedList<Restaurant>();
        allRest.add(new Restaurant("temp"));
        allRest.add(new Restaurant("temp2"));
        allRest.add(new Restaurant("temp3"));
    }

    private Restaurant setRestaurant() {
        currRest = allRest.remove();
        return currRest;
    }


    @OnClick(R.id.imageButtonNo)
    private void onNoButtonClicked() {
        //loadNextOption();
    }

    @OnClick(R.id.imageButtonYes)
    private void onYesButtonClicked() {
        setRestaurant();
        //storeInDecisionList();
        //displayFinalDecision();

    }

    @OnClick(R.id.imageButtonMaybe)
    private void onMaybeButtonClicked() {
        setRestaurant();
        //storeInDecisionList();
        //loadNextOption();
    }





}

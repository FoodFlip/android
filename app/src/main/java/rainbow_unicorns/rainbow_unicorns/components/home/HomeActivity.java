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
    private Queue<Restaurant> decisionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void setAllRestaurants() {
        //TODO
        //from backend
    }

    private void init() {
        decisionList = new LinkedList<>();
        loadAllRestaurants();
    }

    private void loadAllRestaurants() {
        allRest = new LinkedList<>();
        allRest.add(new Restaurant("temp"));
        allRest.add(new Restaurant("temp2"));
        allRest.add(new Restaurant("temp3"));
    }

    private Restaurant setRestaurant() {
        currRest = allRest.peek();
        return currRest;

    }


    @OnClick(R.id.imageButtonNo)
    private void onNoButtonClicked() {
        loadNextOption();
    }


    @OnClick(R.id.imageButtonYes)
    private void onYesButtonClicked() {
        setRestaurant();
        storeInDecisionList();
        displayFinalDecision();

    }

    @OnClick(R.id.imageButtonMaybe)
    private void onMaybeButtonClicked() {
        setRestaurant();
        storeInDecisionList();
        //loadNextOption();
    }

    //??
    private void loadNextOption() {
        //currRest = allRest.

    }

    private void storeInDecisionList() {
        decisionList.add(currRest);
    }

    private void displayFinalDecision() {

    }





}

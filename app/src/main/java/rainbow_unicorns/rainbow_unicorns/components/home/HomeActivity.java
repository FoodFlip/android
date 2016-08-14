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
import rainbow_unicorns.rainbow_unicorns.models.Restaurant;

public class HomeActivity extends AppCompatActivity {

    private ImageView appImageView;

    private ImageButton imageButton;

    private Queue<Restaurant> allRest;

    private Restaurant currRest;

    private Queue<Restaurant> decisionList;

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
        loadAllRestaurants();
    }

    private void loadAllRestaurants() {
        allRest = new LinkedList<>();
        allRest.add(new Restaurant("temp"));
        allRest.add(new Restaurant("temp2"));
        allRest.add(new Restaurant("temp3"));
    }

    private Restaurant displayRestaurant() {
        currRest = allRest.peek();
        textView.setText(currRest.getName());
        return currRest;

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
        decisionList.add(currRest);
    }

    private void displayFinalDecision() {
        //TODO jump to decisions activity
    }

    private void loadNextOption() {
        System.out.println("load next option");
        currRest = allRest.remove();
        displayRestaurant();
    }




}

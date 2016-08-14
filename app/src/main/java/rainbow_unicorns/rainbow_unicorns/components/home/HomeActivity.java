package rainbow_unicorns.rainbow_unicorns.components.home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.LinkedList;
import java.util.Queue;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rainbow_unicorns.rainbow_unicorns.R;
import rainbow_unicorns.rainbow_unicorns.components.decisions.DecisionsActivity;
import rainbow_unicorns.rainbow_unicorns.models.Category;
import rainbow_unicorns.rainbow_unicorns.models.Restaurant;

public class HomeActivity extends AppCompatActivity {

    private ImageView appImageView;

    private ImageButton imageButton;

    private Queue<Restaurant> restaurantList;

    private Category currCategory;

    private Queue<Category> decisionList;

    private Queue<Category> categoryList;

    @BindView(R.id.imageView)
    ImageView imageView;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        init();
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    private void init() {
        decisionList = new LinkedList<>();
        setAllRestaurants();

        //temp
        loadTempRestaurants();
        loadCategories();

    }

    public void setAllRestaurants() {
        //TODO
        //from backend
        //loadCategories();
    }

    private Restaurant makeTempRest() {
        Restaurant temp = new Restaurant();
        temp.name = "tempName";
        return temp;
    }

    private void loadTempRestaurants() {
        restaurantList = new LinkedList<>();
        for (int i = 0; i < 7; i++) {
            Restaurant rest = makeTempRest();
            rest.name.concat(Integer.toString(i));
            rest.categories = new LinkedList<>();
            rest.categories.add(124);
            rest.categories.add(156);
            restaurantList.add(rest);
        }

    }

    private boolean catagoryExists(int catVal) {
        if (categoryList == null) {
            categoryList = new LinkedList<>();
            return false;
        }
        for (Category cat : categoryList) {
            if (cat.getCategoryCode() == catVal) {
                return true;
            }
        }
        return false;
    }

    private void updateCategory(Restaurant restIn, int catValIn) {
        for (Category cat : categoryList) {
            if (cat.getCategoryCode() == catValIn) {
                cat.addRestaurant(restIn);
                break;
            }
        }
    }

    private void loadCategories() {
        //
        boolean alternate = true;
        for (Restaurant restaurant : restaurantList) {
            for (int categoryValue : restaurant.getCategories()) {

                if (!catagoryExists(categoryValue)) {
                    Category newCategory = new Category(categoryValue);
                    //TODO
                    //TEMP
                    //TODO FIX IMAGE PATH

                    //convert category value to image path string
                    switch (categoryValue) {
                        case 339:
                            newCategory.setImagePath(R.drawable.category_image_bagel);
                            break;
                        case 340:
                            newCategory.setImagePath(R.drawable.category_image_bakeries);
                            break;
                        case 341:
                            newCategory.setImagePath(R.drawable.category_image_breweries);
                            break;
                        case 342:
                            newCategory.setImagePath(R.drawable.category_image_cafes);
                            break;
                        case 343:
                            newCategory.setImagePath(R.drawable.category_image_dessert);
                            break;
                        case 344:
                            newCategory.setImagePath(R.drawable.category_image_icecream);
                            break;
                        case 345:
                            newCategory.setImagePath(R.drawable.category_image_internet);
                            break;
                        case 346:
                            newCategory.setImagePath(R.drawable.category_image_juice);
                            break;
                        case 348:
                            newCategory.setImagePath(R.drawable.category_image_american);
                            break;
                        case 349:
                            newCategory.setImagePath(R.drawable.category_image_bbq);
                            break;
                        case 350:
                            newCategory.setImagePath(R.drawable.category_image_buffets);
                            break;
                        case 351:
                            newCategory.setImagePath(R.drawable.category_image_american);
                            break;
                        case 352:
                            newCategory.setImagePath(R.drawable.category_image_chinese);
                            break;
                        case 353:
                            newCategory.setImagePath(R.drawable.category_image_delis);
                            break;
                        case 354:
                            newCategory.setImagePath(R.drawable.category_image_diners);
                            break;
                        case 355:
                            newCategory.setImagePath(R.drawable.category_image_fastfood);
                            break;
                        case 356:
                            newCategory.setImagePath(R.drawable.category_image_french);
                            break;
                        case 357:
                            newCategory.setImagePath(R.drawable.category_image_indian);
                            break;
                        case 358:
                            newCategory.setImagePath(R.drawable.category_image_italian);
                            break;
                        case 359:
                            newCategory.setImagePath(R.drawable.category_image_japanese);
                            break;
                        case 360:
                            newCategory.setImagePath(R.drawable.category_image_korean);
                            break;
                        case 361:
                            newCategory.setImagePath(R.drawable.category_image_mexican);
                            break;
                        case 362:
                            newCategory.setImagePath(R.drawable.category_image_middleeastern);
                            break;
                        case 363:
                            newCategory.setImagePath(R.drawable.category_image_italian);
                            break;
                        case 364:
                            newCategory.setImagePath(R.drawable.category_image_seafood);
                            break;
                        case 365:
                            newCategory.setImagePath(R.drawable.category_image_steakhouses);
                            break;
                        case 366:
                            newCategory.setImagePath(R.drawable.category_image_sushi);
                            break;
                        case 367:
                            newCategory.setImagePath(R.drawable.category_image_thai);
                            break;
                        case 368:
                            newCategory.setImagePath(R.drawable.category_image_vegan);
                            break;
                        case 457:
                            newCategory.setImagePath(R.drawable.category_image_chinese);
                            break;
                        case 458:
                            newCategory.setImagePath(R.drawable.category_image_foodtrucks);
                            break;
                        case 464:
                            newCategory.setImagePath(R.drawable.category_image_international);
                            break;
                    }

                    if (alternate) {
                        newCategory.setImagePath("burgers_image");
                        alternate = false;
                    } else {
                        newCategory.setImagePath("small_emoji");
                        alternate = true;
                    }
                    newCategory.addRestaurant(restaurant);
                    categoryList.add(newCategory);

                } else {
                    updateCategory(restaurant, categoryValue);
                }
            }
        }
    }

    private void readData() {
        loadTempRestaurants();
        loadCategories();
        // get category names
        // get category pictures
    }

    private Category displayCategory() {
        currCategory = categoryList.peek();
        if (currCategory == null) {
            displayFinalDecision();
        } else {
            ImageView img = (ImageView) findViewById(R.id.imageView);
            img.setImageResource(currCategory.getImagePath());

//            switch (currCategory.getImagePath()) {
//                case "small_image":
//                    img.setImageResource(R.drawable.small_image);
//                    break;
//                case "small_emoji":
//                    img.setImageResource(R.drawable.small_emoji);
//                    break;
//                case "burgers_image":
//                    img.setImageResource(R.drawable.burgers_image);
//            }
        }
        return currCategory;
    }

    @OnClick(R.id.imageButtonReject)
    public void onRejectButtonClicked() {
        loadNextOption();
    }


    @OnClick(R.id.imageButtonYes)
    public void onYesButtonClicked() {
        decisionList.clear();
        storeInDecisionList();
        displayFinalDecision();
    }

    @OnClick(R.id.imageButtonMaybe)
    public void onMaybeButtonClicked() {
        storeInDecisionList();
        loadNextOption();
    }
    //??

    private void storeInDecisionList() {
        decisionList.add(currCategory);
    }

    private void displayFinalDecision() {
        closeContextMenu();
        DecisionsActivity displayDecisionsInterface = new DecisionsActivity();

    }

    private void loadNextOption() {
        System.out.println("load next option");
        if (categoryList.isEmpty()) {
            displayFinalDecision();
        } else {
            currCategory = categoryList.remove();
            displayCategory();
        }
    }

/*    @OnClick(R.id.btn_silly_test)
    public void onSillyTestButtonClicked() {
        Timber.i("hello i'm here");
        FoodApiService.get()
                .getRestaurants()
                .subscribeOn(Schedulers.newThread()) // TODO: Ideally, these should be in its own file.
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<List<Restaurant>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Timber.e("error", e);
                    }

                    @Override
                    public void onNext(List<Restaurant> restaurants) {
                        Timber.i("I made it");
                        Timber.i(String.valueOf(restaurants.size()));
                        // TODO: Set this data so that it is accessible.
                    }
                });
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Home Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://rainbow_unicorns.rainbow_unicorns.components.home/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Home Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://rainbow_unicorns.rainbow_unicorns.components.home/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }*/
}

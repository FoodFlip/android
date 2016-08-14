package rainbow_unicorns.rainbow_unicorns.services.foodApi;

import java.util.List;

import rainbow_unicorns.rainbow_unicorns.models.Restaurant;
import retrofit2.http.GET;
import rx.Observable;

public interface FoodApi {

    //    String SERVICE_ENDPOINT = "https://rainbow-unicorns.herokuapp.com";
    String SERVICE_ENDPOINT = "https://be2ca757.ngrok.io";

    @GET("/restaurants")
    Observable<List<Restaurant>> getRestaurants();
}

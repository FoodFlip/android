package rainbow_unicorns.rainbow_unicorns.services.foodApi;

import java.util.List;

import rainbow_unicorns.rainbow_unicorns.models.Restaurant;
import retrofit2.http.GET;
import rx.Observable;

public interface FoodApi {

    //    String SERVICE_ENDPOINT = "https://rainbow-unicorns.herokuapp.com";
    String SERVICE_ENDPOINT = "https://caee5ea5.ngrok.io";

    @GET("/factualInfos")
    Observable<List<Restaurant>> getRestaurants();
}

package rainbow_unicorns.rainbow_unicorns.services.foodApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FoodApiService {

    public static Retrofit retrofit = null;
    public static FoodApi foodApi = null;

    public static Retrofit getRetrofit() {
        if (retrofit != null) return retrofit;
        retrofit = new Retrofit.Builder()
                .baseUrl(FoodApi.SERVICE_ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

    public static FoodApi get() {
        if (foodApi != null) return foodApi;
        foodApi = getRetrofit()
                .create(FoodApi.class);
        return foodApi;
    }
}

package rainbow_unicorns.rainbow_unicorns;

import android.app.Application;
import android.content.Context;

public class RainbowApp extends Application {

    private static Context context;

    public void onCreate() {
        super.onCreate();
        RainbowApp.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return RainbowApp.context;
    }
}

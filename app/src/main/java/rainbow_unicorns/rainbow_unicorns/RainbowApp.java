package rainbow_unicorns.rainbow_unicorns;

import android.app.Application;
import android.content.Context;

import timber.log.Timber;

public class RainbowApp extends Application {

    private static Context context;

    public void onCreate() {
        super.onCreate();
        RainbowApp.context = getApplicationContext();
        Timber.plant(new Timber.DebugTree());
    }

    public static Context getAppContext() {
        return RainbowApp.context;
    }
}

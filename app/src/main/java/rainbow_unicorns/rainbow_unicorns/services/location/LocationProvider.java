package rainbow_unicorns.rainbow_unicorns.services.location;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

import rainbow_unicorns.rainbow_unicorns.RainbowApp;
import rainbow_unicorns.rainbow_unicorns.models.Location;

public class LocationProvider {

    public static LocationProvider locationProvider;
    private LocationManager locationManager;
    private LocationListener locationListener;
    private Location location;

    public static LocationProvider get() {
        if (locationProvider != null) return locationProvider;
        locationProvider = new LocationProvider();
        return locationProvider;
    }

    public LocationProvider() {
        locationManager = (LocationManager) RainbowApp
                .getAppContext()
                .getSystemService(Context.LOCATION_SERVICE);

        locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(android.location.Location inputLocation) {
                location = new Location(inputLocation.getLatitude(), inputLocation.getLongitude());
                setLocation(location);
            }

            @Override
            public void onStatusChanged(String s, int i, Bundle bundle) {}

            @Override
            public void onProviderEnabled(String s) {}

            @Override
            public void onProviderDisabled(String s) {}
        };
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}

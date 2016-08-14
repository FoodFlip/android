package rainbow_unicorns.rainbow_unicorns.models;

import java.util.Queue;

public class Restaurant {
    public String name;
    // public List<String> categories;
    public double dist;
    public String phoneNumber;
    public String address;
    //    public String hours;
    public Queue<Integer> categories;

    public Restaurant() {
    }
    public String getName() {
        return this.name;
    }

    public double getDist() {
        return dist;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

//    public String getHours() {
//        return hours;
//    }

    public Queue<Integer> getCategories() {
        return categories;
    }
}

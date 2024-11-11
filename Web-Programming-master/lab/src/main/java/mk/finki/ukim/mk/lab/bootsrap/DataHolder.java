package mk.finki.ukim.mk.lab.bootsrap;

import jakarta.annotation.PostConstruct;
import mk.finki.ukim.mk.lab.model.Category;
import mk.finki.ukim.mk.lab.model.Event;
import mk.finki.ukim.mk.lab.model.EventBooking;
import mk.finki.ukim.mk.lab.model.Location;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class DataHolder {
    public static final List<Event> events = new ArrayList<>(10);
    public static final List<EventBooking> MyBookings = new ArrayList<>();
    public static final List<Category> categories = new ArrayList<>();
    public static final List<Location> locations = new ArrayList<>();

    public DataHolder() {
        //Categories
        categories.add(new Category((long) (Math.random() * 1000), "Science"));
        categories.add(new Category((long) (Math.random() * 1000), "Dance"));
        categories.add(new Category((long) (Math.random() * 1000), "Food"));
        categories.add(new Category((long) (Math.random() * 1000), "Business"));
        categories.add(new Category((long) (Math.random() * 1000), "Literature"));
        categories.add(new Category((long) (Math.random() * 1000), "Fashion"));

        //Locations
        locations.add(new Location((long) (Math.random() * 1000), "Royal Albert Hall"));
        locations.add(new Location((long) (Math.random() * 1000), "Madison Square Garden"));
        locations.add(new Location((long) (Math.random() * 1000), "Sydney Opera House"));
        locations.add(new Location((long) (Math.random() * 1000), "Eiffel Tower"));
        locations.add(new Location((long) (Math.random() * 1000), "Colosseum"));
        locations.add(new Location((long) (Math.random() * 1000), "Machu Picchu"));
        locations.add(new Location((long) (Math.random() * 1000), "Mount Fuji"));
        locations.add(new Location((long) (Math.random() * 1000), "Burj Khalifa"));
        locations.add(new Location((long) (Math.random() * 1000), "Louvre Museum"));
        locations.add(new Location((long) (Math.random() * 1000), "Tokyo Tower"));

        //Events
        events.add(new Event((long) (Math.random() * 1000), "Tech Conference", "A summit for tech enthusiasts", 8, categories.get(0), locations.get(0)));
        events.add(new Event((long) (Math.random() * 1000), "Dance Festival", "A celebration of dance forms", 7, categories.get(1), locations.get(1)));
        events.add(new Event((long) (Math.random() * 1000), "Gastronomy Expo", "Food and culinary event", 9, categories.get(2), locations.get(2)));
        events.add(new Event((long) (Math.random() * 1000), "Business Summit", "Conference for business leaders", 10, categories.get(3), locations.get(3)));
        events.add(new Event((long) (Math.random() * 1000), "Book Fair", "Literature festival", 6, categories.get(4), locations.get(4)));
        events.add(new Event((long) (Math.random() * 1000), "Fashion Week", "Showcasing latest fashion trends", 9, categories.get(5), locations.get(5)));
        events.add(new Event((long) (Math.random() * 1000), "Global Tech Meet", "An international tech meetup", 8, categories.get(0), locations.get(6)));
        events.add(new Event((long) (Math.random() * 1000), "Culinary Arts Festival", "Celebrating chefs and cuisine", 7, categories.get(2), locations.get(7)));
        events.add(new Event((long) (Math.random() * 1000), "Literature Panel", "Authors and critics discussing books", 9, categories.get(4), locations.get(8)));
        events.add(new Event((long) (Math.random() * 1000), "Health Expo", "A health and wellness conference", 6, categories.get(2), locations.get(9)));
    }
}

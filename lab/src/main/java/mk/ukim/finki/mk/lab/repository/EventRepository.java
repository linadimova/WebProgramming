package mk.ukim.finki.mk.lab.repository;
import lombok.AllArgsConstructor;
import mk.ukim.finki.mk.lab.model.Event;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
public class EventRepository {
    private List<Event> events;

    public EventRepository() {
        this.events = Arrays.asList(
                new Event("event1", "description1",1),
                new Event("event2", "description2",2),
                new Event("event3", "description3",3),
                new Event("event4", "description4",4),
                new Event("event5", "description5",5),
                new Event("event6", "description6",6),
                new Event("event7", "description7",7),
                new Event("event8", "description8",8),
                new Event("event9", "description9",9),
                new Event("event10", "description10",10)
        );
    }

    public List<Event> findAll(){
        return events;
    }

    public List<Event> searchEvents(String text){
     return events.stream().filter(event -> event.getName().contains(text) || event.getPopulsrityScore()>=Double.parseDouble(text)).toList();
    }
}

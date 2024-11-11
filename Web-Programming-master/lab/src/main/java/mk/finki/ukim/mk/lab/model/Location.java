package mk.finki.ukim.mk.lab.model;
import lombok.Data;

@Data
public class Location {
    private Long id;
    private String name;
    private String address;
    private String capacity;
    private String description;

    public Location(Long id, String address) {
        this.id = id;
        this.address = address;
    }
}

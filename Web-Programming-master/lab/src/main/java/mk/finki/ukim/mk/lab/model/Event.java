package mk.finki.ukim.mk.lab.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Event {
    private Long Id;
    private String name;
    private String description;
    private double popularityScore;
    private Category category;
    private Location location;

}

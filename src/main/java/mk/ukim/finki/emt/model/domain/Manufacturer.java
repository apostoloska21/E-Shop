package mk.ukim.finki.emt.model.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "manufacturer_address")
    private String address;
    public Manufacturer(){}

    public Manufacturer(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

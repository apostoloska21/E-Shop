package mk.ukim.finki.emt.model.views;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

@Data
@Entity
@Subselect("SELECT * FROM public.products_per_manufacturer")
@Immutable //this marks the class as read only
public class ProductsPerManufacturerView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long manufacturerId;
    @Column(name = "num_products")
    private Integer numProducts;
}

package kg.easy.shop.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "prices")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date addDate;
    private Date endDate;
    private double price;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}

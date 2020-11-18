package kg.easy.shop.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Date addDate;
    private int minAmount;
    private int maxAmount;
    private Date expirationDate;
    private String qr;
    @ManyToOne
    @JoinColumn(name = "provider_id")
    private Customer provider;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}

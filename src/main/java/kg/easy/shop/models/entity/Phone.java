package kg.easy.shop.models.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String num;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}

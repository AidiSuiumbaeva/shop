package kg.easy.shop.models.entity;

import kg.easy.shop.models.entity.Customer;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "debtBook")
public class DebtBook {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double sum;

    @OneToOne
    @JoinColumn(name="customer_id")
    private Customer customer;
}

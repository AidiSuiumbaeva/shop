package kg.easy.shop.models.entity;

import kg.easy.shop.models.enumPackage.OperationType;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "operation")
public class Operation {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToOne
    @JoinColumn(name="role_id")
    private Customer customer;
    private double sum;
    private double actualSum;
    private double difference;
    private Date date;

    @Enumerated(EnumType.STRING)
    private OperationType type;

}

package kg.easy.shop.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "operationDetails")
public class OperationDetail {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    private int amount;
    @ManyToOne
    @JoinColumn(name = "operation_id")
    private Operation operation;


}

package kg.easy.shop.models.entity;

import kg.easy.shop.models.enumPackage.Role;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private Role role;



}

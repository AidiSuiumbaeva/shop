package kg.easy.shop.models.entity;

import kg.easy.shop.models.entity.Account;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;

    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;


}


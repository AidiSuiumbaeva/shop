package kg.easy.shop.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
            private String name;
            @ManyToOne
            @JoinColumn(name = "mainCategory_id")
    private Category mainCategory;

}

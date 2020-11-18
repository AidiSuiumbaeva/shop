package kg.easy.shop.models.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ProductDto {
    private Long id;
    private String name;
    private Date addDate;
    private int minAmount;
    private int maxAmount;
    private Date expirationDate;
    private String qr;
    private CustomerDto provider;
    private CategoryDto category;
}

package kg.easy.shop.models.dto;

import lombok.Data;

import java.util.Date;

@Data
public class PriceDto {

    private Long id;
    private Date addDate;
    private Date endDate;
    private double price;
    private ProductDto product;

}

package kg.easy.shop.models.dto;

import lombok.Data;

@Data
public class OperationDetailDto {
    private Long id;
    private ProductDto product;
    private int amount;
    private OperationDto operation;
}

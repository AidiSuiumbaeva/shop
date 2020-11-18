package kg.easy.shop.models.dto;

import lombok.Data;

@Data
public class DebtBookDto {
    private Long id;
    private double sum;
    private CustomerDto customer;
}

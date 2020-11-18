package kg.easy.shop.models.dto;

import kg.easy.shop.models.entity.Customer;
import lombok.Data;

@Data
public class PhoneDto {
    private Long id;
    private String num;
    private UserDto user;
    private Customer customer;
}

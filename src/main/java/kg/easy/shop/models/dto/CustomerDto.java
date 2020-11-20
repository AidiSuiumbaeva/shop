package kg.easy.shop.models.dto;

import kg.easy.shop.models.entity.Phone;
import kg.easy.shop.models.enumPackage.Role;
import lombok.Data;

import java.util.List;

@Data
public class CustomerDto {
    private Role role;
    private List<PhoneDto> phoneDtos;
}

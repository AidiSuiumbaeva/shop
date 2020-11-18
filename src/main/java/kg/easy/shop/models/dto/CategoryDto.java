package kg.easy.shop.models.dto;

import kg.easy.shop.models.entity.Category;
import lombok.Data;

@Data
public class CategoryDto {
    private Long id;
    private String name;
    private Category mainCategory;
}


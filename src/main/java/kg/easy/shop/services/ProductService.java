package kg.easy.shop.services;

import kg.easy.shop.models.dto.ProductDto;
import kg.easy.shop.models.entity.Response;

public interface ProductService {

    Response save(ProductDto productDto);
}

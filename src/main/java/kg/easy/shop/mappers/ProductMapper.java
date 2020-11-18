package kg.easy.shop.mappers;

import kg.easy.shop.models.dto.ProductDto;
import kg.easy.shop.models.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper PRODUCT_MAPPER= Mappers.getMapper(ProductMapper.class);

    Product toProduct(ProductDto productDto);
    ProductDto toDto(Product product);
}

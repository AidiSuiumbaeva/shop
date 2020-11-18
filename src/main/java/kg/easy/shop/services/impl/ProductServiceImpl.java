package kg.easy.shop.services.impl;

import kg.easy.shop.controllers.repositories.ProductRep;
import kg.easy.shop.mappers.ProductMapper;
import kg.easy.shop.models.dto.ProductDto;
import kg.easy.shop.models.entity.Product;
import kg.easy.shop.models.entity.Response;
import kg.easy.shop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRep productRep;
    @Override
    public Response save(ProductDto productDto) {
        Response response=Response.getResponse();
       Product product=productRep.save(ProductMapper.PRODUCT_MAPPER.toProduct(productDto));
        response.setObject(product);
        return response;
    }
}

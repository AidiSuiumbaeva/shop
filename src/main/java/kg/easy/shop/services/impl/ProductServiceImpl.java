package kg.easy.shop.services.impl;

import kg.easy.shop.mappers.ProductMapper;
import kg.easy.shop.models.dto.CategoryDto;
import kg.easy.shop.models.dto.CustomerDto;
import kg.easy.shop.models.dto.ProductDto;
import kg.easy.shop.models.entity.Product;
import kg.easy.shop.models.entity.Response;
import kg.easy.shop.repositories.ProductRep;
import kg.easy.shop.services.CategoryService;
import kg.easy.shop.services.CustomerService;
import kg.easy.shop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRep productRep;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CategoryService categoryService;
    @Override
    public Response save(ProductDto productDto) {
        Response response=Response.getResponse();

        CustomerDto customerDto=customerService.save(productDto.getProvider());
        productDto.setProvider(customerDto);

        CategoryDto categoryDto=categoryService.save(productDto.getCategory());
        productDto.setCategory(categoryDto);

     //   if(productDto.getMaxAmount()<productDto.getMinAmount()){

       // }
       Product product=productRep.save(ProductMapper.PRODUCT_MAPPER.toProduct(productDto));
        response.setObject(product);
        return response;
    }
}

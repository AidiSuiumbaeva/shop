package kg.easy.shop.controllers;

import kg.easy.shop.models.dto.ProductDto;
import kg.easy.shop.models.entity.Product;
import kg.easy.shop.models.entity.Response;
import kg.easy.shop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCTRL {

    @Autowired
    private ProductService service;



    @PostMapping("/save")
    public Response save(@RequestBody ProductDto productDto){

        return service.save(productDto);

    }
}

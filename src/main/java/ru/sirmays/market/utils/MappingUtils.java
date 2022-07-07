package ru.sirmays.market.utils;

import org.springframework.stereotype.Service;
import ru.sirmays.market.dto.ProductDto;
import ru.sirmays.market.model.Product;

@Service
public class MappingUtils {
    public ProductDto mapProductToProductDto(Product product){
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setTitle(product.getTitle());
        productDto.setPrice(product.getPrice());
        productDto.setCategoryTitle(product.getCategory().getTitle());
        return productDto;
    }
    //из dto в entity
//    public Product mapProductDtoToProduct(ProductDto productDto){
//        Product product = new Product();
//        product.setId(productDto.getId());
//        product.setTitle(productDto.getTitle());
//        product.setPrice(productDto.getPrice());
//        product.setCategory(productDto.getCategoryTitle());
//        return product;
//    }
}

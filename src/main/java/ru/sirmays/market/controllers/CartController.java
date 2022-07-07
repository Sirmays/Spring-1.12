package ru.sirmays.market.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.sirmays.market.dto.ProductDto;
import ru.sirmays.market.model.Product;
import ru.sirmays.market.services.CartService;
import ru.sirmays.market.services.ProductService;
import ru.sirmays.market.utils.MappingUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;
    private final MappingUtils mappingUtils;




    @GetMapping("/cart")
    public List<ProductDto> showAll() {

        return cartService.showAll().stream()
                .map(mappingUtils::mapProductToProductDto)
                .collect(Collectors.toList());


    }

    @GetMapping("/cart/delete/{id}")
    public void delete(@PathVariable Long id) {
        cartService.deleteProduct(id);
    }

    @GetMapping("/cart/add/{id}")
    public void addToCart(@PathVariable Long id) {
        cartService.addProduct(id);
    }


}

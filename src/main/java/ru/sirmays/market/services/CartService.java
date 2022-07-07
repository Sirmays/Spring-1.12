package ru.sirmays.market.services;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.sirmays.market.dto.ProductDto;
import ru.sirmays.market.model.Cart;
import ru.sirmays.market.model.Product;
import ru.sirmays.market.repositories.ProductRepository;
import ru.sirmays.market.utils.MappingUtils;

import java.util.List;

@Component
@Service
public class CartService {
    Cart cart;
    private final ProductRepository productRepository;

    public CartService(ProductRepository productRepository, MappingUtils mappingUtils) {
        cart = new Cart();
        this.productRepository = productRepository;
    }

    public void addProduct(Long id) {
        List<Product> productsInCart = cart.getProductsInCart();
          productsInCart.add(productRepository.findById(id).get());
    }

    public void deleteProduct(Long id) {
        List<Product> productsInCart = cart.getProductsInCart();
      productsInCart.remove(productRepository.findById(id).get());

    }

    public List<Product> showAll() {
        return cart.getProductsInCart();
    }
}

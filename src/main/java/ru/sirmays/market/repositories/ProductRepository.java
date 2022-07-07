package ru.sirmays.market.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sirmays.market.model.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {





//        List<Product> findByPriceBetween(int minPrice, int maxPrice);
//
//        List<Product> findProductsByPriceLessThanEqual (int maxPrice);
//
//        List<Product> findProductsByPriceGreaterThanEqual (int minPrice);
}

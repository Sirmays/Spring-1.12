package ru.sirmays.market.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.sirmays.market.dto.ProductDto;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
@RequiredArgsConstructor
public class Cart {

    private List<Product> productsInCart = new ArrayList<>();





}






//    private final ProductRepository productRepository;

//    public void addProduct(Integer id) {
//        productsInCart.add(productRepository.findById(id));
//    }
//
////    public void removeProduct(Integer id) {
////        Product result = null;
//        Iterator<Product> iterator = productsInCart.iterator();
//        while (iterator.hasNext()) {
//            Product a = iterator.next();
//            if (id.equals(a.getId())) {
//                result = a;
//            }
//        }
//        productsInCart.remove(result);
//
//    }
//
//    public void printProducts() {
//        if (productsInCart.isEmpty()) {
//            System.out.println("Сейчас в корзине пусто");
//        } else {
//            System.out.println("Сейчас в корзине: \n" + productsInCart);
//        }
//
//    }
//
//}

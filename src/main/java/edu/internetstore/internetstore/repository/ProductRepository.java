package edu.internetstore.internetstore.repository;

import edu.internetstore.internetstore.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public interface ProductRepository extends JpaRepository<ProductEntity, UUID> {
//    private List<Product> products;

//    public ProductRepository() {
//        products = new ArrayList<>();
//        createProducts();
//    }
//
//    private void createProducts() {
//        products.addAll(List.of(
//                Product.builder().id(1L).name("Computer").price(new BigDecimal("10000")).build(),
//                Product.builder().id(2L).name("Laptop").price(new BigDecimal("40000")).build(),
//                Product.builder().id(3L).name("TV").price(new BigDecimal("25000")).build()));
//    }
    Optional<ProductEntity> findById(String id);
    ProductEntity findByName(String name);


}

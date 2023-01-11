package edu.internetstore.internetstore.repository;

import edu.internetstore.internetstore.entity.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductRepository implements Repository<Product> {
    private List<Product> products;

    public ProductRepository() {
        products = new ArrayList<>();
        createProducts();
    }

    private void createProducts() {
        products.addAll(List.of(
                Product.builder().id(1L).name("Computer").price(new BigDecimal("10000")).build(),
                Product.builder().id(2L).name("Laptop").price(new BigDecimal("40000")).build(),
                Product.builder().id(3L).name("TV").price(new BigDecimal("25000")).build()));
    }

    @Override
    public List<Product> getAllData() {
        return products;
    }

    @Override
    public void insertAll(List<Product> data) {
        products.addAll(data);
    }
}

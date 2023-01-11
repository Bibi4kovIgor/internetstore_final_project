package edu.internetstore.internetstore.service;

import edu.internetstore.internetstore.entity.Product;
import edu.internetstore.internetstore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements InternetStoreService<Product> {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllData() {
        return productRepository.getAllData();
    }

    @Override
    public void insertData(Product element) {
        productRepository.insertAll(List.of(element));
    }

    @Override
    public Product updateData(Product element) {
        return null;
    }

    @Override
    public Product getData(Product element) {
        return null;
    }
}

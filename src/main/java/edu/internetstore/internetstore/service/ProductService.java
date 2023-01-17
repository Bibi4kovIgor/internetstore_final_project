package edu.internetstore.internetstore.service;

import edu.internetstore.internetstore.dto.ProductDto;
import edu.internetstore.internetstore.entity.ProductEntity;
import edu.internetstore.internetstore.repository.ProductRepository;
import edu.internetstore.internetstore.util.DtoToEntity;
import edu.internetstore.internetstore.util.EntityToDto;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements InternetStoreService<ProductDto> {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDto> getAllData() {
        return productRepository.findAll()
                .stream()
                .map(EntityToDto::productEntityToDto)
                .toList();
    }

    @Override
    public void insertData(ProductDto element) {
        ProductEntity productEntity = DtoToEntity.productDtoToEntity(element);
        productRepository.save(productEntity);
    }

    @Override
    public void updateData(String id, ProductDto productDto) {
        ProductEntity productFromRepository = productRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Product was not found"));
        ProductEntity product = DtoToEntity.productDtoToEntity(productDto);
        productFromRepository.setId(product.getId());
        productFromRepository.setName(product.getName());
        productFromRepository.setAvailable(product.isAvailable());
        productFromRepository.setPrice(product.getPrice());
        productFromRepository.setDescription(product.getDescription());
        productRepository.save(productFromRepository);
    }

    @Override
    public ProductDto getData(ProductDto element) {
        ProductEntity productEntity = DtoToEntity.productDtoToEntity(element);
        return EntityToDto.productEntityToDto(productRepository.findById(productEntity.getId())
                .orElseThrow(() -> new EntityNotFoundException("Product was not found")));

    }
}

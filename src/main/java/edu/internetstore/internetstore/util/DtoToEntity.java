package edu.internetstore.internetstore.util;

import edu.internetstore.internetstore.dto.ProductDto;
import edu.internetstore.internetstore.entity.ProductEntity;

import java.util.UUID;

public class DtoToEntity {
    public static ProductEntity productDtoToEntity(ProductDto productDto) {
        return ProductEntity.builder()
                .name(productDto.getName())
                .price(productDto.getPrice())
                .available(productDto.isAvailable())
                .description(productDto.getDescription())
                .build();
    }

}

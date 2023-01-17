package edu.internetstore.internetstore.util;

import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
import edu.internetstore.internetstore.dto.ProductDto;
import edu.internetstore.internetstore.entity.ProductEntity;

import java.util.UUID;

public class EntityToDto {
    public static ProductDto productEntityToDto(ProductEntity productEntity) {
        return ProductDto.builder()
                .id(productEntity.getId().toString())
                .name(productEntity.getName())
                .price(productEntity.getPrice())
                .available(productEntity.isAvailable())
                .description(productEntity.getDescription())
                .build();
    }
}

package edu.internetstore.internetstore.util;

import edu.internetstore.internetstore.dto.ProductsDto;
import edu.internetstore.internetstore.entity.ProductsEntity;

import java.util.UUID;

public class DtoToEntity {
    public static ProductsEntity productDtoToEntity(ProductsDto productsDto) {
        return ProductsEntity.builder()
                .id(UUID.fromString(productsDto.getId()))
                .name(productsDto.getName())
                .price(productsDto.getPrice())
                .available(productsDto.isAvailable())
                .description(productsDto.getDescription())
                .vendorCode(productsDto.getVendorCode())
                .build();
    }

}

package edu.internetstore.internetstore.service;

import edu.internetstore.internetstore.dto.ChecksDto;
import edu.internetstore.internetstore.entity.ChecksEntity;
import edu.internetstore.internetstore.repository.ChecksRepository;
import edu.internetstore.internetstore.util.EntityToDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ChecksService implements InternetStoreService<ChecksDto> {

    @Autowired
    ChecksRepository checksRepository;

    @Override
    public List<ChecksDto> getAllData() {
        List<ChecksEntity> checks = checksRepository.findAll();
        List<ChecksDto> checksDto = checks.stream()
                .map(EntityToDto::checksEntityToDto)
//                .map(check -> check.setCheckSum(
//                        new BigDecimal(check.getQuantity()).multiply(check.getProduct().getPrice())))
                .toList();
        // TODO: Add total sum calculations

        return checksDto;
    }



    @Override
    public ChecksDto getDataById(String id) {
        return null;
    }

    @Override
    public void insertData(ChecksDto element) {

    }

    @Override
    public void updateData(ChecksDto element) {

    }

    @Override
    public ChecksDto getData(ChecksDto element) {
        return null;
    }
}

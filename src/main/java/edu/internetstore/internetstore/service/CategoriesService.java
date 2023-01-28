package edu.internetstore.internetstore.service;

import edu.internetstore.internetstore.dto.CategoriesDto;
import edu.internetstore.internetstore.repository.CategoriesRepository;
import edu.internetstore.internetstore.util.EntityToDto;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesService implements InternetStoreService<CategoriesDto> {

    @Autowired
    private CategoriesRepository categoriesRepository;

    @Override
    public List<CategoriesDto> getAllData() {
        return null;
    }

    @Override
    public void insertData(CategoriesDto element) {

    }

    @Override
    public void updateData(CategoriesDto element) {

    }

    @Override
    public CategoriesDto getData(CategoriesDto element) {
        return null;
    }

    @Override
    public CategoriesDto getDataById(String id) {
        return EntityToDto.categoryEntityToDto(
                categoriesRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("No category was found")));
    }

}

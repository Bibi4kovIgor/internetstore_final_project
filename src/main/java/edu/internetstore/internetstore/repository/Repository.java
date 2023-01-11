package edu.internetstore.internetstore.repository;

import java.util.List;

public interface Repository<T> {
    List<T> getAllData();
    void insertAll(List<T> data);
}

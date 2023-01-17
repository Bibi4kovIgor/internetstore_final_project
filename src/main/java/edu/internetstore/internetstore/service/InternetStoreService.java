package edu.internetstore.internetstore.service;

import java.util.List;

public interface InternetStoreService<T> {
    List<T> getAllData();
    void insertData(T element);
    void updateData(String id, T element);
    T getData(T element);
}

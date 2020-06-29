package ru.nsd.islandcount;

import java.util.List;

public interface Dao<T> {
    List<T> findAll();
    List<T> findById(int id);
    boolean insert(T data);
    boolean update(T data);
    boolean delete(int id);

}

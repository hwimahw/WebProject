package ru.nsd.islandcount;

import java.util.List;

public interface Dao<T> {
    List<T> findAll();
    List<T> findById();
    boolean insert(T data);
    boolean update(int id);
    boolean delete(int id);

}

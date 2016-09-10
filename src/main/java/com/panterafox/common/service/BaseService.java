package com.panterafox.common.service;

import java.util.List;

/**
 * Created by Yaroslav on 10.09.2016.
 */
public interface BaseService<T> {
    T add(T entity);
    void delete(int id);
    T edit(T entity);
  //  T get(int id);
    List<T> getAll();

}

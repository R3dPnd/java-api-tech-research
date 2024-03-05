package com.inertia.service.data;

import java.util.List;

public interface IDataService<T>{
    public T get(int id);

    public List<T> getAll();

    public T saveOrUpdate(T entity);

    public void delete(int id);
}

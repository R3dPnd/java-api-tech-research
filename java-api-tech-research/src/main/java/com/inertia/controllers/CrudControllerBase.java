package com.inertia.controllers;

import com.inertia.entities.JournalEntryEntity;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface CrudControllerBase<T> {

    public List<T> getAll();

    public T get(@RequestParam int id);

    public T saveOrUpdate(@RequestParam JournalEntryEntity entry);

    public T delete(@RequestParam int id);
}

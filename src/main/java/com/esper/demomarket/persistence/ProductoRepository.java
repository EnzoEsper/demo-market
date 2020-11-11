package com.esper.demomarket.persistence;

import com.esper.demomarket.persistence.crud.ProductoCrudRepository;
import com.esper.demomarket.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}

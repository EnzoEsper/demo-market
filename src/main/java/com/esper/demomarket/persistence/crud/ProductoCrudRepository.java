package com.esper.demomarket.persistence.crud;

import com.esper.demomarket.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

}

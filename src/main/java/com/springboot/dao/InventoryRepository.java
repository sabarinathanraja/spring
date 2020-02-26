package com.springboot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.springboot.model.Inventory;


@Repository
public interface InventoryRepository extends CrudRepository<Inventory, Integer>{

}

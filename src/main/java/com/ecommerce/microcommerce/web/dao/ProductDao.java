package com.ecommerce.microcommerce.web.dao;

import com.ecommerce.microcommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mister__iks
 * @Twitter @Mister__iks
 */
@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
    Product findById(int id);
    List<Product> findAll();
}

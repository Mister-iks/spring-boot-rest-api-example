package com.ecommerce.microcommerce.web.controller;

import com.ecommerce.microcommerce.model.Product;
import com.ecommerce.microcommerce.web.dao.ProductDao;
import com.ecommerce.microcommerce.web.exceptions.NotFoundproductException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Objects;

/**
 * @author Mister__iks
 * @Twitter @Mister__iks
 */

@RestController
public class ProductController {
    @Autowired
    private  ProductDao productDao;

    @GetMapping(value = "/products")
    public List<Product> productsList() {
        return productDao.findAll();
    }

    @GetMapping("/products/{idProduct}")
    public Product getOneProduct(@PathVariable int idProduct) {
        Product currentProduct = productDao.findById(idProduct);
        if (currentProduct == null ) throw new NotFoundproductException("Le produit avec l'id "+ idProduct+" est introuvable");
        return currentProduct;
    }
//
    @PostMapping(value = "/products")
    public ResponseEntity<Product> saveOne(@Valid @RequestBody Product product) {
        Product productAdded = productDao.save(product);
        if (Objects.isNull(productAdded)) return ResponseEntity.noContent().build();
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{idProduct}")
                .buildAndExpand(productAdded.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

}

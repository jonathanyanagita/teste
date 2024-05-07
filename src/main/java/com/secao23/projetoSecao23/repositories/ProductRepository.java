package com.secao23.projetoSecao23.repositories;

import com.secao23.projetoSecao23.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

package com.secao23.projetoSecao23.repositories;

import com.secao23.projetoSecao23.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

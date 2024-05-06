package com.secao23.projetoSecao23.repositories;

import com.secao23.projetoSecao23.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

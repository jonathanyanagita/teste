package com.secao23.projetoSecao23.repositories;

import com.secao23.projetoSecao23.entities.OrderItem;
import com.secao23.projetoSecao23.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

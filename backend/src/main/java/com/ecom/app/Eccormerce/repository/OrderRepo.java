package com.ecom.app.Eccormerce.repository;

import com.ecom.app.Eccormerce.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}

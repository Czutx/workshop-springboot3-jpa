package com.educandoweb.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.Course.entities.OrderItem;
import com.educandoweb.Course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}

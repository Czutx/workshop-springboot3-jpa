package com.educandoweb.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.Course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

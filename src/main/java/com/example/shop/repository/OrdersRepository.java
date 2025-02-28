package com.example.shop.repository;

import com.example.shop.entity.Orders;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Orders, Long> {
    @Query("select o from Orders o where o.members.email=:email")
    public Page<Orders> findOrders(String email, Pageable pageable);

    public Page<Orders> findByMembersEmail(String email, Pageable pageable);
}

package co.web.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import co.web.ecommerce.model.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long>{

}

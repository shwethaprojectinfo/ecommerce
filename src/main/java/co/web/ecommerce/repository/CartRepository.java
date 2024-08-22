package co.web.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.web.ecommerce.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long>{

}

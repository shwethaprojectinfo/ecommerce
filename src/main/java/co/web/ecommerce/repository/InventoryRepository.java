package co.web.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import co.web.ecommerce.model.Inventory;
public interface InventoryRepository extends JpaRepository<Inventory, Long>{

}

package co.web.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.web.ecommerce.model.Store;

public interface StoreRepository extends JpaRepository<Store, Long>{

}

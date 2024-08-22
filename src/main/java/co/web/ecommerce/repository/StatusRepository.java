package co.web.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.web.ecommerce.model.Status;

public interface StatusRepository extends JpaRepository<Status, Long>{

}

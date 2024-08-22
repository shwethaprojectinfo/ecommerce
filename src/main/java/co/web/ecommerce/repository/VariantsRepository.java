package co.web.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.web.ecommerce.model.Variants;

public interface VariantsRepository extends JpaRepository<Variants, Long>{

}

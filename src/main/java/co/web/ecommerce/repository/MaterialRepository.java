package co.web.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import co.web.ecommerce.model.Material;

public interface MaterialRepository extends JpaRepository<Material, Long>{

}

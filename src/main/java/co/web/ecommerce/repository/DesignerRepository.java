package co.web.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import co.web.ecommerce.model.Designer;


public interface DesignerRepository extends JpaRepository<Designer, Long> {



	Designer  findByEmail(String email);
	
	@Query("select designer from Designer designer where designer.email= :email AND designer.isdeleted = 0 ")
	Optional<Designer>  findByEmailid(@Param("email") String email);
	
	boolean existsByEmail(String email);
	
	
}

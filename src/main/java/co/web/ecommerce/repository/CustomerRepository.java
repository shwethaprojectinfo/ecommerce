package co.web.ecommerce.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import co.web.ecommerce.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer ,Long>{
	
	
	
	Customer findByEmail(String email);
	
	@Query("SELECT  customer FROM Customer customer "
			+ " JOIN Customeraddress address ON (address.isdeleted=0 AND customer.id=address.customerid)"
			+ " JOIN Orders orders ON (orders.isdeleted=0 AND orders.customeraddressid=address.id)"
			+ " JOIN Orderdetails details ON (details.isdeleted=0 AND details.ordersid=details.id)"
			+ "	JOIN Store store ON (store.isdeleted=0 AND store.id=details.storeid)"
			+ "	JOIN Storebrand brands ON (brands.isdeleted=0 AND brands.storeid=store.id)"
			+ "	JOIN Designer designer ON (designer.isdeleted=0 AND designer.id=brands.id)"
			+ "	WHERE designer.id = :id and customer.isdeleted=0 ")
	List<Customer> findByDesignerid(@Param("id") Long designerId);

      boolean existsByEmail(String email);
      
      
      

}

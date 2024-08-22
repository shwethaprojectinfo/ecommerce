package co.web.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import co.web.ecommerce.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

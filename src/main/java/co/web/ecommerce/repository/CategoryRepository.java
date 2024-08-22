package co.web.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import co.web.ecommerce.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
}

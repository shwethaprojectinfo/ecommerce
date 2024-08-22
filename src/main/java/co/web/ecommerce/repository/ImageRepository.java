package co.web.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.web.ecommerce.model.Image;

public interface ImageRepository extends JpaRepository<Image , Long>{

}

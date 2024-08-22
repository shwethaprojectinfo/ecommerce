package co.web.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.web.ecommerce.model.Brand;
import co.web.ecommerce.repository.BrandRepository;

@RestController
public class ApiContoller {
	
	@Autowired
	private BrandRepository brandRepository;
	
	@GetMapping(value = "/")
	public String getPage()
	{
		return "welcome";
	}
	 
	@GetMapping(value = "/Brand")
	public List<Brand> getBrand(){
		return brandRepository.findAll();
	}
	
	@PostMapping(value = "/save")
	public String saveBrand(@RequestBody Brand brand) {
		brandRepository.save(brand);
		return "saved..";
	}
	

	

}

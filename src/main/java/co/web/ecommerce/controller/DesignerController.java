package co.web.ecommerce.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.util.MultiValueMap;

import co.web.ecommerce.Request.DesignerSignUpRequest;
import co.web.ecommerce.model.Designer;
import co.web.ecommerce.repository.DesignerRepository;
import co.web.ecommerce.service.DesignerService;

@RestController
@CrossOrigin
public class DesignerController {

	@Autowired
	private DesignerRepository designerRepository;

	@Autowired
	private DesignerService designerService;

	@PostMapping("/designerSignup")
	public ResponseEntity<Object> addDesigner(@Valid @RequestBody DesignerSignUpRequest designerSignUpRequestDto) {
		// Check if the email already exists
		if (designerRepository.existsByEmail(designerSignUpRequestDto.getEmail())) {
			// Return error response with duplicate email message
			//return new ResponseEntity<>("Email already exist", HttpStatus.BAD_REQUEST);
			return ResponseEntity.badRequest().body("{\"error\": \"Email already exists\"}");
		}

		// Return success response with saved designer
		designerService.save(designerSignUpRequestDto);
		//return new ResponseEntity<>("Designer details registered successfully", HttpStatus.OK);
		return ResponseEntity.ok().body("{\"message\": \"Designer details registered successfully\"}");
		
	}

	@PostMapping(value = "/designerlogin")
	public ResponseEntity<Object> login(@RequestBody Designer designer) {
		
		if (!validateLoginRequest(designer)) {
			return ResponseEntity.badRequest().body("Invalid login request");
		}

//		 Check if the designer email exists
		Designer existingDesigner = designerRepository.findByEmail(designer.getEmail());
		if (existingDesigner == null) {
			return ResponseEntity.badRequest().body("{\"error\": \"Invalid Email\"}");
		}

		// Compare the provided password with the stored hashed password
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		if (!encoder.matches(designer.getPassword(), existingDesigner.getPassword())) {
			return ResponseEntity.badRequest().body("{\"error\": \"Incorrect password\"}");
		}

//		return ResponseEntity.ok().body( "Login successful");
		
		return ResponseEntity.ok().body("{\"message\": \"Login\"}");
		
	}

	private boolean validateLoginRequest(Designer designer) {
		// TODO Auto-generated method stub
		return true;
	}

	public DesignerService getDesignerService() {
		return designerService;
	}

	public void setDesignerService(DesignerService designerService) {
		this.designerService = designerService;
	}



@PostMapping("/getDesignerData")
public ResponseEntity<Map<String, Object>> getDesigner(@RequestBody Designer email) {
	
	Map<String, Object> map = new HashMap<>();
	
Optional<Designer> designer = designerRepository.findByEmailid(email.getEmail());

	if (Objects.nonNull(designer)){
		map.put("designer", designer);
		map.put("message", "Designer Fetched successfully");
		return ResponseEntity.ok().body(map);
	}
	
	map.put("error", "Designer does not exist");
	
	 return ((BodyBuilder) ResponseEntity.notFound()).body(map);
}
	

}



























//	
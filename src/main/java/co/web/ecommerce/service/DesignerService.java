package co.web.ecommerce.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import co.web.ecommerce.Request.DesignerSignUpRequest;
import co.web.ecommerce.model.Designer;

@Service
@Component
public interface DesignerService {
	 Designer save(DesignerSignUpRequest  designerSignUpRequestDto);
	
	

}

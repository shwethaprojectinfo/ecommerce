package co.web.ecommerce.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import co.web.ecommerce.Request.DesignerSignUpRequest;
import co.web.ecommerce.model.Designer;
import co.web.ecommerce.repository.DesignerRepository;
import co.web.ecommerce.service.DesignerService;

@Service
public class DesignerServiceImpl implements DesignerService{
	
	@Autowired
	private DesignerRepository designerRepo;
	
	
	@Autowired
	private Designer designer;
	
	@Override
	public Designer save(DesignerSignUpRequest  designerSignUpRequestDto ) {
		
		Designer designer = new Designer();
		
		designer.setName(designerSignUpRequestDto .getName());
		designer.setEmail(designerSignUpRequestDto.getEmail());
		designer.setPassword(designerSignUpRequestDto.getPassword());
		designer.setMobilenumber(designerSignUpRequestDto.getMobilenumber());
		designer.setAddressline1(designerSignUpRequestDto.getAddressline1());
		designer.setAddressline2(designerSignUpRequestDto.getAddressline2());
		designer.setLandmark(designerSignUpRequestDto.getLandmark());
		designer.setCity(designerSignUpRequestDto.getCity());
		designer.setCountry(designerSignUpRequestDto.getCountry());
		designer.setPincode(designerSignUpRequestDto.getPincode());
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	    String encode = passwordEncoder.encode(designerSignUpRequestDto.getPassword());
	    designer.setPassword(encode);
		
		return designerRepo.saveAndFlush(designer);
	}
	}



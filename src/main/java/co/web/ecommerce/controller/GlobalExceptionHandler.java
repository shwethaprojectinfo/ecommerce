package co.web.ecommerce.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.MethodArgumentNotValidException;
import java.util.List;
import java.util.ArrayList;

public class GlobalExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)

	 
	 public ResponseEntity<ErrorResponse> handleValidationExceptions(MethodArgumentNotValidException ex) {
	        List<String> errors = new ArrayList<>();
	        ex.getBindingResult().getFieldErrors().forEach(error -> errors.add(error.getDefaultMessage()));

	        ErrorResponse response = new ErrorResponse();
	        response.setStatus(400);
	        response.setMessage("Validation error");
	        response.setErrors(errors);

	        return ResponseEntity.badRequest().body(response);
	  

}
}

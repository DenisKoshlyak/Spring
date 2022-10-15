package main;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {
	@ExceptionHandler(NotEnoughMoneyException.class)
	public ResponseEntity<ErrorDetails> makeException() {
		ErrorDetails error = new ErrorDetails();
		error.setMessage("Not enough money for pay");
		
		return ResponseEntity
				.badRequest()
				.body(error);
	}
}

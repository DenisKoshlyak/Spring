package main;

import java.util.UUID;
import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import proxy.PaymentProxy;

@RestController
public class PaymentController {
	private final PaymentProxy proxy;
	
	public PaymentController(PaymentProxy proxy) {
		this.proxy = proxy;
	}
	
	@PostMapping("/payment")
	public Payment createPayment(@RequestBody Payment payment) {
		String requestID = UUID.randomUUID().toString();
		return proxy.createPayment(requestID, payment);
	}
}

package proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import main.Payment;

@FeignClient(name = "payment", url = "&{name.service.url}")
public interface PaymentProxy {
	@PostMapping("/payment")
	Payment createPayment(@RequestHeader String requestID, @RequestBody Payment payment);
}

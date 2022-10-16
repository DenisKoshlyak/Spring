package main;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JdbcController {
	private final PurchaseRepository purchaseRepository;
	
	public JdbcController(PurchaseRepository purchaseRepository) {
		this.purchaseRepository = purchaseRepository;
	}
	
	@PostMapping("/purchase")
	public void storePurchase(@RequestBody Purchase purchase) {
		purchaseRepository.storePuchase(purchase);
	}
	
	@GetMapping("/purchase")
	public List<Purchase> findPurchases(){
		return purchaseRepository.findAllPurchases();
	}
}

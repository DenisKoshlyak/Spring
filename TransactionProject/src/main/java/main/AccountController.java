package main;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Account;
import model.Transfer;

@RestController
public class AccountController {
	private final TransferService transferService;
	
	public AccountController(TransferService transferService) {
		this.transferService = transferService;
	}
	
	@PostMapping("/transfer")
	public List<Account> transferAmount(@RequestBody Transfer transfer) {
		return transferService.trasferAmount(transfer);
	}
	
	@PostMapping("/addPerson")
	public void addPerson(@RequestBody Account person) {
		transferService.addPerson(person);
	}
	
	@GetMapping("/findAllPerson")
	public List<Account> findPerson() {
		return transferService.findAllPerson();
	}
}

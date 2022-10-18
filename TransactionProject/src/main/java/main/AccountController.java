package main;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Person;
import model.Transfer;

@RestController
public class AccountController {
	private final TransferService transferService;
	
	public AccountController(TransferService transferService) {
		this.transferService = transferService;
	}
	
	@PostMapping("/transfer")
	public List<Person> transferAmount(@RequestBody Transfer transfer) {
		return transferService.trasferAmount(transfer);
	}
	
	@PostMapping("/addPerson")
	public void addPerson(@RequestBody Person person) {
		transferService.addPerson(person);
	}
	
	@GetMapping("/findAllPerson")
	public List<Person> findPerson() {
		return transferService.findAllPerson();
	}
}

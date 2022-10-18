package main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import model.Person;
import model.Transfer;

@Service
public class TransferService {
	private final AccountRepository repository;
	
	public TransferService(AccountRepository repository) {
		this.repository = repository;
	}
	
	@Transactional
	public void trasferAmount(Transfer transfer) {
		List<Person> list = new ArrayList<>();
		
		Person sender = repository.findAccountByID(transfer.getIdSender());
		Person receiver = repository.findAccountByID(transfer.getIdReceiver());
		
		BigDecimal newSenderBalance = sender.getBalance().subtract(transfer.getBalance());
		BigDecimal newReceiverBalance = receiver.getBalance().add(transfer.getBalance());
		
		repository.setBalance(transfer.getIdSender(), newSenderBalance);
		repository.setBalance(transfer.getIdReceiver(), newReceiverBalance);
		
		list.add(sender);
		list.add(receiver);
		
		throw new RuntimeException();
	}
	
	public Person getPersonById(int id) {
		return repository.findAccountByID(id);
	}
	
	public void addPerson(Person person) {
		repository.addPerson(person);
	}
	
	public List<Person> findAllPerson(){
		return repository.findAllPerson();
	}
	
	public void setBalance(int id, BigDecimal balance) {
		repository.setBalance(id, balance);
	}
}

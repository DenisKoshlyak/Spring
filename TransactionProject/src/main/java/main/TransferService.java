package main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import model.Account;
import model.Transfer;

@Service
public class TransferService {
	private final AccountRepository1 repository;
	
	public TransferService(AccountRepository1 repository) {
		this.repository = repository;
	}
	
	@Transactional
	public List<Account> trasferAmount(Transfer transfer) {
		List<Account> list = new ArrayList<>();
		
		Account sender = repository.findAccountById(transfer.getIdSender());
		Account receiver = repository.findAccountById(transfer.getIdReceiver());
		
		BigDecimal newSenderBalance = sender.getBalance().subtract(transfer.getBalance());
		BigDecimal newReceiverBalance = receiver.getBalance().add(transfer.getBalance());
		
		repository.setBalance(newSenderBalance, transfer.getIdSender());
		repository.setBalance(newReceiverBalance, transfer.getIdReceiver());
		
		list.add(sender);
		list.add(receiver);
		
		return list;
	}
	
	public Account getPersonById(int id) {
		return repository.findAccountById(id);
	}
	
	public void addPerson(Account person) {
		repository.addPerson(person);
	}
	
	public List<Account> findAllPerson(){
		return repository.findAllPerson();
	}
	
	public void setBalance(int id, BigDecimal balance) {
		repository.setBalance(balance, id);
	}
}

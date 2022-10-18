package main;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import model.Account;

public interface AccountRepository1 extends CrudRepository<Account, Integer>{
	@Query
	public Account findAccountById(int id);
	
	@Query("INSERT INTO account VALUES (?, ?, ?)")
	@Modifying
	public void addPerson(Account man);
	
	@Query("SELECT * FROM account")
	public List<Account> findAllPerson();
	
	@Query
	@Modifying
	public void setBalance(BigDecimal balance, int id);
}



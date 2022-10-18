package main;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import model.Account;
import model.Transfer;
import repository.PersonRowMapper;

@Repository
public class AccountRepository {
	private final JdbcTemplate jdbc;
	
	public AccountRepository(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	
	public void addPerson(Account man) {
		String sql = "INSERT INTO account VALUES (?, ?, ?)";
		jdbc.update(sql, null, man.getName(), man.getBalance());
	}
	
	public Account findAccountByID(int id){
		String sql = "SELECT * FROM account WHERE id = ?";
		return jdbc.queryForObject(sql, new PersonRowMapper(), id);
	}
	
	public List<Account> findAllPerson(){
		String sql = "SELECT * FROM account";
		return jdbc.query(sql, new PersonRowMapper());
	}
	
	public void setBalance(int id, BigDecimal balance) {
		String sql = "UPDATE account SET balance = ? WHERE id = ?";
		jdbc.update(sql, balance, id);
	}
}

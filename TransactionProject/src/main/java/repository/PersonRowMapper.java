package repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import model.Account;

public class PersonRowMapper implements RowMapper<Account>{
	@Override
	public Account mapRow(ResultSet resultSet, int i) throws SQLException{
		Account p = new Account();
		p.setId(resultSet.getInt("id"));
		p.setName(resultSet.getString("name"));
		p.setBalance(resultSet.getBigDecimal("balance"));
		return p;
	}
}

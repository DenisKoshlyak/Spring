package repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import model.Person;

public class PersonRowMapper implements RowMapper<Person>{
	@Override
	public Person mapRow(ResultSet resultSet, int i) throws SQLException{
		Person p = new Person();
		p.setId(resultSet.getInt("id"));
		p.setName(resultSet.getString("name"));
		p.setBalance(resultSet.getBigDecimal("balance"));
		return p;
	}
}

package config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class Config {
	
	@Value("${custom.datasource.url}")
	private String dataSourceUrl;
	
	@Value("${custom.datasource.username}")
	private String dataSourceUsername;
	
	@Value("${custom.datasource.url}")
	private String dataSourcePassword;
	
	@Bean
	public DataSource dataSource() {
		HikariDataSource dataSource = new HikariDataSource();
		
		dataSource.setJdbcUrl(dataSourceUrl);
		dataSource.setUsername(dataSourceUsername);
		dataSource.setPassword(dataSourcePassword);
		dataSource.setConnectionTimeout(1000);
		
		return dataSource;
	}
}

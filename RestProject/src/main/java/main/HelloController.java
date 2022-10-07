package main;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello!";
	}
	
	@GetMapping("/ciao")
	public String ciao() {
		return "Ciao!";
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Country>> getInfoFrance() {
		Country france = Country.of("France", 67);
		Country russia = Country.of("Russia", 155);
		List<Country> all = List.of(france, russia);
		return ResponseEntity
				.status(HttpStatus.ACCEPTED)
				.header("Continent", "Europe")
				.header("capital", "Paris")
				.header("favorite_food", "cheese_and_wine")
				.body(all);	
	}
	
}

package main;

import org.springframework.stereotype.Service;
import model.Product;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
	private List<Product> products = new ArrayList<>();
	
	public void addProduct(Product p) {
		products.add(p);
	}
	
	public List<Product> findAll(){
		return products;
	}
}

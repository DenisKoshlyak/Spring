package main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import model.Product;

@Controller
public class ProductController {
	private final ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping("/products")
	public String viewProducts(Model model) {
		var products = productService.findAll();
		model.addAttribute("products", products);
		return "Products.html";
	}
	
	@PostMapping("/products")
	public String addProducts(Model model, Product p) {
		productService.addProduct(p);
		
		var newProducts = productService.findAll();
		model.addAttribute("products", newProducts);
		
		return "Products.html";
	}
	
}

package dao;

import java.util.ArrayList;
import dto.Product; 

public class ProductRepository {
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();
	
	public static ProductRepository getInstance() {
		return instance;
	}
	
	public ProductRepository() {
		Product padding = new Product("P1234", "say cheese padding", 22000);
		padding.setDescription("ultralight dog padding, Technology and Comfort Wear");
		padding.setCategory("Padding");
		padding.setManufacturer("Channel Pet");
		padding.setUnitsInStock(200);
		padding.setCondition("Refurbished");
		padding.setFilename("P1234.png");
		
		Product vest = new Product("P1235", "코코 밍크털 패딩조끼", 11900);
		vest.setDescription("Warm padded vest, 2022 F/W");
		vest.setCategory("Vest");
		vest.setManufacturer("CoCoStudio");
		vest.setUnitsInStock(1000);
		vest.setCondition("New");
		vest.setFilename("P1235.png");
		
		Product shoes = new Product("P1236", "Spider Shoes", 45500);
		shoes.setDescription("Not lost dog boots, harness set, four Seasons");
		shoes.setCategory("Shoes");
		shoes.setManufacturer("RomanceDog");
		shoes.setUnitsInStock(800);
		shoes.setCondition("New");
		shoes.setFilename("P1236.png");
		
		listOfProducts.add(padding);
		listOfProducts.add(vest);
		listOfProducts.add(shoes);
		
	}
	
	public ArrayList<Product> getAllProducts(){
		return listOfProducts;
	}
	
	public Product getProductById(String productId) {
		Product productById = null;
		
		for(int i=0; i<listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			
			if(product!=null && product.getProductId()!= null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		
		return productById;
	}
	
	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
}
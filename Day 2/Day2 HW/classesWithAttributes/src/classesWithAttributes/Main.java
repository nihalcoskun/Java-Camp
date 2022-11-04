package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1); 
		product.setDescription("Asus Laptop"); 
		product.setPrice(5000);
		product.setStockAmount(3); 
		
		//Constructor
		Product product2 = new Product(2, "Telefon", "Iphone 13", 7000, 10);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		productManager.Add(product2);

	}

}

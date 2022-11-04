package classesWithAttributes;

public class ProductManager {

	public void Add(Product product)
	{
		System.out.println("Ürün eklendi: " + product.getName() + " (" + product.getDescription() + " - " + product.getCode() + ")");
	}
	
}

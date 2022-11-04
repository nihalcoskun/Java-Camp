
public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		
		//set values
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitsInStock(3);
		product1.setImageUrl("coffee.jpg");
		
		Product product2 = new Product();
		
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrice(6500);
		product2.setDiscount(5);
		product2.setUnitsInStock(3);
		product2.setImageUrl("coffee2.jpg");
		
		
		Product product3 = new Product();
		
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setUnitPrice(4500);
		product3.setDiscount(9);
		product3.setUnitsInStock(4);
		product3.setImageUrl("coffee3.jpg");
		
		
		Product[] products = {product1, product2, product3 };
		
		//get value
		for (Product product : products)
		{
		System.out.println(product.getName());
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer(); 
		individualCustomer.setId(1);
		individualCustomer.setPhone("224654845352");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Nihal");
		individualCustomer.setLastName("Coşkun");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("35454521254");
		corporateCustomer.setCustomerNumber("78945");
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setTaxNumber("0044888331111");
		
		Customer[] customers = { individualCustomer, corporateCustomer };
		
	}

}

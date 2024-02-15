package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName(null); = "Laptop";
		product.setId(0); = 1;
		product.setDescription(null); = "Asus Laptop";
		product.setPrice(0); = 5000;
		product.setStockAmount(0); = 3;
		

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		

		System.out.println(product.name);

	}

}

package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		//JDBC veritabanýna ekleme kodlarý
		System.out.println("Ürün eklendi : "+product.getName());
	}
	
	public void Add2(int id,String name,String description,int stockAmount, double price) {
		
		System.out.println("Ürün eklendi : "  + name);
	}
}

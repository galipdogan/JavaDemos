package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		//JDBC veritaban�na ekleme kodlar�
		System.out.println("�r�n eklendi : "+product.getName());
	}
	
	public void Add2(int id,String name,String description,int stockAmount, double price) {
		
		System.out.println("�r�n eklendi : "  + name);
	}
}

package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("static yapýcý blok çalýþtý"); // static kýsýmda çalýþýr
	}
	
	public ProductValidator () {
		System.out.println("Yapýcý blok çalýþtý");// new leyip çaðýrýnca çalýþýr
	}
	
	public static boolean isValid(Product product) {
		if (product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
}

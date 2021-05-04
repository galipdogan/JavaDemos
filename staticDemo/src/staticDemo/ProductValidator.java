package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("static yap�c� blok �al��t�"); // static k�s�mda �al���r
	}
	
	public ProductValidator () {
		System.out.println("Yap�c� blok �al��t�");// new leyip �a��r�nca �al���r
	}
	
	public static boolean isValid(Product product) {
		if (product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
}

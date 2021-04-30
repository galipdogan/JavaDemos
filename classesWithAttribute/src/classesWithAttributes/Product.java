package classesWithAttributes;

//Product nesnesinin iki türlü kullanýmýný yaptýk constructor ile 
//overloading yaptýk kullanýcý parametreli yada parametresiz kullanýmý ile kullanabilir.
public class Product {
	
	//constructor 
	//Ben product ý sadece parametreleri verirsen çalýþtýrýrým demektir.
	public Product(int id, String name,String description, double price, int stockAmount, String renk){
		
		System.out.println("Yapýcý blok çalýþtý");
		this.id=id;
		this.renk=renk;
		this.name=name;
		this.price=price;
		this.stockAmount=stockAmount;
		
	}
	
	
	public Product() {}
	
	//attribute | field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
	//getter
	public int getId(){
		return id;
	}
	//setter
	public void setId(int id){
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getKod() {
		return this.name.substring(0,1)+id;
	}

	
	
}



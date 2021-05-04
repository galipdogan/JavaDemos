package interfaces;

public class CustomerManager {
	
	private CustomerDal customerDal;
	
	public CustomerManager(CustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	
	public void add() {
		//i� kodlar�n�n yaz�ld��� yer
		customerDal.add();
	}

}


public class CustomerManager implements CustomerService{
	
	 AuthorizeService authorizeService;

	    public CustomerManager(AuthorizeService authorizeService) {
	        this.authorizeService = authorizeService;
	    }
	
	
	

	@Override
	public void login(Customer customer) {
		
		  if (authorizeService.verify(customer))
	        {
	            System.out.println("Kullan�c� Giri�i Ba�ar�l�!");

	        }
	        else {
	            System.out.println("Kullan�c� giri�i ba�ar�s�z!");
	        }
	}

	@Override
	public void update(Customer customer) {
		 System.out.println(customer.getFirstName()+" "+ customer.getLastName()+" isimli kullan�c�n�n g�ncellemesi yap�ld�.");
	}

	@Override
	public void delete(Customer customer) {
		 System.out.println(customer.getFirstName()+" "+ customer.getLastName()+" isimli kullan�c� silindi.");
		
	}

}

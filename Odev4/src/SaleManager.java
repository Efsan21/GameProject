
public class SaleManager implements SaleService {

	@Override
	public void add(Sale sale, Game game, Customer customer, Campaign campaign) {
		System.out.println(sale.getId()+"'Numaral� i�lem: "+game.getName()+" isimli oyun "+customer.getFirstName()+" "+customer.getLastName()+" kullan�c�s�na "+campaign.getCampaignName()+" kampanyas� ile sat�ld�");
		
	}

	@Override
	public void delete(Sale sale) {
		System.out.println(sale.getId()+"'Numaral� sat�� silindi.");
		
	}

	@Override
	public void update(Sale sale) {
		System.out.println(sale.getId()+"'Numaral� sat�� g�ncellendi.");
		
	}

	@Override
	public void getAll(Sale[] sales) {
		System.out.println("Kay�tl� kredi kart� bilgileri");
        for (Sale sale : sales) {
            System.out.println(sale.getId()+"' Numaral� kullan�c�: " +sale.getCreditCardNo());

        }
		
	}

}

package Managers;
import Entities.Campaign;
import Entities.Sale;
import Entities.User;
import Interfaces.SaleService;

public class SaleManager implements SaleService {
	
	Campaign campaign;
	User user;

	public SaleManager(User user,Campaign campaign) {
		this.user = user;
		this.campaign=campaign;
	}

	@Override
	public void add(Sale sale) {
		System.out.println(user.getFirstName()+" adlý kiþiye fatura kesilmiþtir "+campaign.campaignName+"uygulanmýþtýr");
		
	}

	@Override
	public void delete(Sale sale) {
		System.out.println(user.getFirstName()+" adlý kiþinin faturasý silinmiþtir");
		
	}

	@Override
	public void update(Sale sale) {
		System.out.println(user.getFirstName()+" adlý kiþinin iade iþlemi yapýlmýþtýr.");
		
	}

}

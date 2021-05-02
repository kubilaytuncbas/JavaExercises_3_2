import Entities.Campaign;
import Entities.Game;
import Entities.Sale;
import Entities.User;
import Managers.CampaignManager;
import Managers.GameManager;
import Managers.PersonVerificationManager;
import Managers.SaleManager;
import Managers.UserManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Campaign campaign=new Campaign(1,"Hoşgeldin Yaz İndirimi",30);
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign);
		Game game=new Game(1,"LeagueOfLegends",20);
		GameManager gameManager=new GameManager();
		gameManager.add(game);
		User user=new User(1,"Kubilay","Tuncbas",1998,"12345678901");
		UserManager userManager=new UserManager(new PersonVerificationManager());
		userManager.add(user);
		Sale sale=new Sale(1);
		SaleManager saleManager=new SaleManager(user, campaign);
		saleManager.add(sale);

	}

}

import controllers.ControllerProduct;
import controllers.ControllerShoe;
import controllers.ShopController;
import controllers.ShoppingCartController;
import models.Admin;
import models.CarShop;
import models.Customer;
import models.ListOfAdmin;
import models.ListOfCustomers;
import models.ListOfShops;
import models.ModelProduct;
import models.Product;
import models.ShoesShop;
import models.ModelSubjectProduct;
import models.PhoneShop;
import models.Shop;
import models.ShoppingCart;
import views.LoginWinView;
import views.ShoppingCartView;
import views.ViewProduct;
import views.ViewProductText;
import views.ViewShop;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListOfAdmin listA = new ListOfAdmin();
		ListOfCustomers listC = new ListOfCustomers();
		Admin a1 = new Admin("alex", "Paris", "email", "alex","aaa" );
		Customer c1 = new Customer("kevin","Hong Kong","email","kev","azerty");
		ListOfShops listShops = new ListOfShops();
		
		
		ShoesShop s1 = new ShoesShop();
		
		
		PhoneShop s2 = new PhoneShop();
		
		
		CarShop s3 = new CarShop();
		
		
		
		/*listShops.setShop(s1, sv1, sc1);
		listShops.setShop(s2, sv2, sc2);
		listShops.setShop(s3, sv3, sc3);
		
		*/
		listA.addAdmin(a1);
		listC.addCustomer(c1);
	//	listShops.load();
		
		s1.load();
		ShopController sc1 = new ShopController(s1);
		ViewShop sv1 = new ViewShop(sc1, s1);
		sc1.setView(sv1);
		
		
		s2.load();
		ShopController sc2 = new ShopController(s2);
		ViewShop sv2 = new ViewShop(sc2, s2);
		sc2.setView(sv2);
		
		s3.load();
		ShopController sc3 = new ShopController(s3);
		ViewShop sv3 = new ViewShop(sc3, s3);
		sc3.setView(sv3);
		//listShops.getController(0).activateView();
		
		
		
		/*ModelProduct p1 = new Product("test2", 142, 4);
		ControllerProduct c15 = new ControllerShoe((ModelSubjectProduct) p1);
		ViewProduct v1 = new ViewProductText(c15, (ModelSubjectProduct) p1);
		c15.setView(v1);
		v1.activateView();
		listShops.getModel(0).addProduct(p1, c15, v1);
		listShops.save();*/
		
		//listShops.getController(0).activateView();
		
		
		LoginWinView l1 = new LoginWinView( s1,s2,s3,listA, listC,sc1,sc2,sc3);
		//System.out.println(listShops.toString());
		
		
		
		
	}

}

import controllers.ControllerProduct;
import controllers.ControllerShoe;
import controllers.ShopController;
import controllers.ShoppingCartController;
import models.ModelProduct;
import models.Product;
import models.ModelSubjectProduct;
import models.Shop;
import models.ShoppingCart;
import views.ShoppingCartView;
import views.ViewProduct;
import views.ViewProductText;
import views.ViewShop;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModelProduct m1 = new Product(0,"test",125,3);
		ControllerProduct c1 = new ControllerShoe((ModelSubjectProduct) m1);
		ViewProduct v1 = new ViewProductText(c1, (ModelSubjectProduct) m1);
		
		ModelProduct m2 = new Product(1, "test2", 500, 2);
		ControllerProduct c2 = new ControllerShoe((ModelSubjectProduct) m2);
		ViewProduct v2 = new ViewProductText(c2, (ModelSubjectProduct) m2);
		
		/*Shop s1 = new Shop();
		ShopController sc1 = new ShopController(s1);
		ViewShop sv1 = new ViewShop(sc1, s1);
		
		sc1.addProduct(m1, c1, v1);
		sc1.addProduct(m2, c2, v2);
		sc1.setView(sv1);
		sv1.displayProducts();
		*/
		
		ShoppingCart cart = new ShoppingCart();
		ShoppingCartController cartC = new ShoppingCartController(cart);
		ShoppingCartView cartV = new ShoppingCartView(cart, cartC);
		cartC.setView(cartV);
		
		cartC.addProduct((Product) m1, c1, v1);
		
		System.out.println("--------------------------");
		cartC.addProduct(m2, c2, v2);
		
		
		
	//	c1.setView(v1);
		//v1.activateView();
		
	}

}

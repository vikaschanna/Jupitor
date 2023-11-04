package scripts;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import ObjectRepo.CartPage;
import ObjectRepo.ContactsPage;
import ObjectRepo.HomePage;
import ObjectRepo.ShopPage;

public class testScenario1 extends BaseClass {
	
	@Test
	public void test1() {
		HomePage h = new HomePage(driver);
		ContactsPage c = new ContactsPage(driver);
		h.clickOnContactsPage();
		c.clickOnSubmitBtn();
		c.checkErrorMsg();
		c.verifyAndEnterIntoToFileds();
	}
	
	@Test
	public void test2() throws InterruptedException {
		HomePage h = new HomePage(driver);
		ContactsPage c = new ContactsPage(driver);
		h.clickOnContactsPage();
		c.enterDataIntoFileds();
		c.clickOnSubmitBtn();
		Thread.sleep(8000);
		c.verifySuccessfulMsg();
	}
	
	@Test
	public void test3() {
		HomePage h = new HomePage(driver);
//		ContactsPage c = new ContactsPage(driver);
		ShopPage s = new ShopPage(driver);
		CartPage cp = new CartPage(driver);
		
		
		h.clickOnShopPage();
		for (int i = 1; i <= 2; i++) {
			s.buyFluffyBunny();
		}
		for (int i = 1; i <= 5; i++) {
			s.buyStuffedFrog();
		}
		for (int i = 1; i <= 3; i++) {
			s.buyValentineBear();
		}
		Double rateOfFrogInShop = s.verifyRateOfEachProduct();
		s.clickOnCartBtn();
		Double rateOfFrogInCart = cp.EachProductRateOfFrog();
		
		if(rateOfFrogInCart.equals(rateOfFrogInShop)) {
			System.out.println("product rate is verified");
		}else {
			System.out.println("product rate mismatched");
		}
		
//		Map<Object, Object> m = new HashMap<Object, Object>();
		
		
		
	}
}

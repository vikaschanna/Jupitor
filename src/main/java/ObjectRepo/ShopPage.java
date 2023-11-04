package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage {

	//declaration
	@FindBy(xpath="(//a[.='Buy'])[2]")
	private WebElement Frog;
	
	@FindBy(xpath="(//a[.='Buy'])[4]")
	private WebElement Bunny;
	
	@FindBy(xpath="(//a[.='Buy'])[7]")
	private WebElement Bear;
	
	@FindBy(xpath="//a[@href='#/cart']")
	private WebElement cartBtn;
	
	@FindBy(xpath="//h4[.='Stuffed Frog']/..//p//span")
	private WebElement frogRate;
	
	//initialization
	public ShopPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getFrog() {
		return Frog;
	}

	public void setFrog(WebElement frog) {
		Frog = frog;
	}

	public WebElement getBunny() {
		return Bunny;
	}

	public void setBunny(WebElement bunny) {
		Bunny = bunny;
	}

	public WebElement getBear() {
		return Bear;
	}

	public void setBear(WebElement bear) {
		Bear = bear;
	}
	
	public WebElement getCartBtn() {
		return cartBtn;
	}

	public void setCartBtn(WebElement cartBtn) {
		this.cartBtn = cartBtn;
	}

	public WebElement getFrogRate() {
		return frogRate;
	}

	public void setFrogRate(WebElement frogRate) {
		this.frogRate = frogRate;
	}

	//business logic
	public void buyStuffedFrog() {
			Frog.click();
	}
	
	public void buyFluffyBunny() {
			Bunny.click();
	}
	
	public void buyValentineBear() {
			Bear.click();
	}
	
	public void clickOnCartBtn() {
		cartBtn.click();
	}
	
	public Double verifyRateOfEachProduct() {
		String rate = frogRate.getText();
		rate=rate.substring(1);
		Double each = Double.valueOf(rate);
		return each;
	}
}

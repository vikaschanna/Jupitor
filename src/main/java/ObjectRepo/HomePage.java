package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//declaration
	@FindBy(xpath="//a[.='Shop']")
	private WebElement shopBtn;
	
	@FindBy(xpath="//a[.='Contact']")
	private WebElement contactsBtn;
	
	@FindBy(xpath="//a[.='Start Shopping »']")
	private WebElement srartShoppingLink;
	
	@FindBy(xpath="//a[.='Login']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//li[@id='nav-cart']")
	private WebElement cartBtn;
	
	//initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getShopBtn() {
		return shopBtn;
	}

	public void setShopBtn(WebElement shopBtn) {
		this.shopBtn = shopBtn;
	}

	public WebElement getContactsBtn() {
		return contactsBtn;
	}

	public void setContactsBtn(WebElement contactsBtn) {
		this.contactsBtn = contactsBtn;
	}

	public WebElement getSrartShoppingLink() {
		return srartShoppingLink;
	}

	public void setSrartShoppingLink(WebElement srartShoppingLink) {
		this.srartShoppingLink = srartShoppingLink;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}

	public WebElement getCartBtn() {
		return cartBtn;
	}

	public void setCartBtn(WebElement cartBtn) {
		this.cartBtn = cartBtn;
	}
	
	
	//business logic
	public void clickOnContactsPage() {
		contactsBtn.click();
	}
	
	public void clickOnShopPage() {
		shopBtn.click();
	}
}

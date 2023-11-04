package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	//declaration
	@FindBy(xpath="(//td[.=' Stuffed Frog']/following-sibling::td[number(translate(text(),'$',''))>1])[1]")
	private WebElement eachProductRate;
	
	//initialization
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getEachProductRate() {
		return eachProductRate;
	}

	public void setEachProductRate(WebElement eachProductRate) {
		this.eachProductRate = eachProductRate;
	}
	
	//business logic
	public Double EachProductRateOfFrog() {
		String rate = eachProductRate.getText();
		rate=rate.substring(1);
		Double eachRate = Double.valueOf(rate);
//		Integer eachRate = Integer.valueOf(rate);
		return eachRate;
		
	}
	
	 
}

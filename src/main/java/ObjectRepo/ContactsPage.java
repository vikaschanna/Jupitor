package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	
	//declaration
	@FindBy(xpath="//a[.='Submit']")
	private WebElement submitBtn;
	
	@FindBy(xpath="//input[@id='forename']")
	private WebElement foreNameTF;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailTF;
	
	@FindBy(xpath="//textarea[@id='message']")
	private WebElement messageTF;
	
	@FindBy(xpath="//div[@class='alert alert-error ng-scope']")
	private WebElement errorMsg;
	
	@FindBy(xpath="//span[@id='forename-err']")
	private WebElement forenameIsRequiredMsg;
	
	@FindBy(xpath="//span[@id='email-err']")
	private WebElement emailRequiredMsg;
	
	@FindBy(xpath="//span[@id='message-err']")
	private WebElement messageReqMsg;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement successMsg;
	
	//initialization
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public void setSubmitBtn(WebElement submitBtn) {
		this.submitBtn = submitBtn;
	}

	public WebElement getForeNameTF() {
		return foreNameTF;
	}

	public void setForeNameTF(WebElement foreNameTF) {
		this.foreNameTF = foreNameTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public void setEmailTF(WebElement emailTF) {
		this.emailTF = emailTF;
	}

	public WebElement getMessageTF() {
		return messageTF;
	}

	public void setMessageTF(WebElement messageTF) {
		this.messageTF = messageTF;
	}
	
	public WebElement getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(WebElement errorMsg) {
		this.errorMsg = errorMsg;
	}

	public WebElement getForenameIsRequiredMsg() {
		return forenameIsRequiredMsg;
	}

	public void setForenameIsRequiredMsg(WebElement forenameIsRequiredMsg) {
		this.forenameIsRequiredMsg = forenameIsRequiredMsg;
	}

	public WebElement getEmailRequiredMsg() {
		return emailRequiredMsg;
	}

	public void setEmailRequiredMsg(WebElement emailRequiredMsg) {
		this.emailRequiredMsg = emailRequiredMsg;
	}

	public WebElement getMessageReqMsg() {
		return messageReqMsg;
	}

	public void setMessageReqMsg(WebElement messageReqMsg) {
		this.messageReqMsg = messageReqMsg;
	}

	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public void setSuccessMsg(WebElement successMsg) {
		this.successMsg = successMsg;
	}

	//business logic
	public void clickOnSubmitBtn() {
		submitBtn.click();
	}
	
	public void checkErrorMsg() {
		String message=errorMsg.getText();
		if(message.contains("but we won't get it unless you complete the form correctly.")) {
			System.out.println("Error message is displayed");
		}else {
			System.out.println("error isn't displayed");
		}
	}
	
	public void verifyAndEnterIntoToFileds() {
		String message = forenameIsRequiredMsg.getText();
		if(message.contains("Forename is required")) {
			System.out.println(message);
		}else {
			System.out.println("error msg in not displayed");
		}
		foreNameTF.sendKeys("vikas");
		if(message.contains("Forename is required")) {
			System.out.println(message);
		}else {
			System.out.println("error msg in not displayed");
		}
		
		String msg=emailRequiredMsg.getText();
		if(msg.contains("Email is required")) {
			System.out.println(msg);
		}else {
			System.out.println("error msg in not displayed");
		}
		emailTF.sendKeys("vikas@gmail.com");
		if(msg.contains("Forename is required")) {
			System.out.println(msg);
		}else {
			System.out.println("error msg in not displayed");
		}
		
		String me = messageReqMsg.getText();
		if(me.contains("Forename is required")) {
			System.out.println(me);
		}else {
			System.out.println("error msg in not displayed");
		}
		messageTF.sendKeys("hi");
		if(me.contains("Forename is required")) {
			System.out.println(me);
		}else {
			System.out.println("error msg in not displayed");
		}
	}
	
	public void verifySuccessfulMsg() {
		String msg = successMsg.getText();
		if(msg.contains("we appreciate your feedback")) {
			System.out.println(msg);
		}
	}
	
	public void enterDataIntoFileds() {
		foreNameTF.sendKeys("vikas");
		emailTF.sendKeys("vikas@gmail.com");
		messageTF.sendKeys("hi");
	}
	
}

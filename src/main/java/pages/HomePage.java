package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	@FindBy(xpath = "//*[@id='nav-cart123']")
	private WebElement cartIcon;
	
	@FindBy(xpath = "//*[@class='a-carousel-card']//img[@alt='Outdoortoys']")
	private WebElement toysSection;
	
	@FindBy(xpath = "//*[@id='nav-link-accountList']")
	private WebElement accountSignIn;
	
	@FindBy(xpath = "//*[@id='nav-flyout-ya-signin']//*[@class='nav-action-signin-button']")
	
	private WebElement signInHoverButton;
	
	@FindBy(xpath = "//*[@id='ap_email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//*[@id='ap_password']")
	private WebElement password;
	
	@FindBy(xpath = "//*[@id='signInSubmit']")
	private WebElement finalSignInButton;
	
	WebDriver driver;
	
	WebDriverWait wait;
	

	public HomePage(WebDriver driver) 
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	
	}
	
	public String getTitleOfPage()
	{
		String title = driver.getTitle();
		
		return title;
	}
	
	public boolean verifyCartIcon()
	{
		boolean isDisplaying = cartIcon.isDisplayed();
		
		return isDisplaying;
	}
	
	public void enteringDealSection()
	{
		wait.until(ExpectedConditions.visibilityOf(toysSection));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", toysSection);
	
	}
	
	
	public void goToSignIn()
	{
		Actions act = new Actions(driver);
		
		act.moveToElement(accountSignIn).perform();
		
		signInHoverButton.click();
		
		
	}
	
	public void enteringUsername(String uname)
	{
		email.sendKeys(uname);
		
		continueButton.click();
	}
	
	public void finalSignIn(String pwd)
	{
		password.sendKeys(pwd);
		finalSignInButton.click();
	}

}

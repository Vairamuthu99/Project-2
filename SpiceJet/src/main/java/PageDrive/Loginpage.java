package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.Utilclass;

public class Loginpage extends Utilclass {
	
	WebDriver driver;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[contains(text(),'Login')]")
	WebElement Logop;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-zso239'])[4]")
	WebElement Erob;
	
	@FindBy(xpath="(//input[@autocapitalize='sentences'])[3]")
	WebElement Eeid;
	
	@FindBy(xpath="(//input[@autocapitalize='sentences'])[4]")
	WebElement Epas;
	
	@FindBy(xpath="//div[@data-testid='login-cta']")
	WebElement Logb;
	
	public void Login(String Email ,String Password ) {
		Logop.click();
		Erob.click();
		Eeid.sendKeys(Email);
		Epas.sendKeys(Password);
		Logb.click();
	}
}

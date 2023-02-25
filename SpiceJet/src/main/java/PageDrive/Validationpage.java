package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.Utilclass;

public class Validationpage extends Utilclass {
	
	WebDriver driver;

	public Validationpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[contains(text(),'check-in')])[1]")
	WebElement CIn;

	@FindBy(xpath = "//div[contains(text(),'flight status')]")
	WebElement FlS;

	@FindBy(xpath = "//div[contains(text(),'manage booking')]")
	WebElement MBk;

	public boolean CheckIn() {

		return CIn.isDisplayed();
	}

	public boolean FlightStatus() {

		return FlS.isDisplayed();
	}

	public boolean ManageBooking() {

		return MBk.isDisplayed();
	}
}

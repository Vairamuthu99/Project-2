package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.Utilclass;

public class Onewaypage extends Utilclass {

	WebDriver driver;

	public Onewaypage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa'])[1]")
	WebElement Oway;

	@FindBy(xpath = "(//input[@dir='auto'])[1]")
	WebElement FmDes;

	@FindBy(xpath = "(//input[@dir='auto'])[2]")
	WebElement ToDes;

	@FindBy(xpath = "(//div[@style='font-family: inherit;'])[112]")
	WebElement DDate;

	@FindBy(xpath = "//div[@data-testid='home-page-flight-cta']")
	WebElement SFlight;
	
	public void Oneways() {
		Oway.click();
	}

	public void FromOrigin(String From) {
		FmDes.sendKeys(From);
	}

	public void ToDestination(String To) {
		ToDes.sendKeys(To);
	}

	public void DepartureDate() {
		DDate.click();
	}

	public void Searchflight() {
		SFlight.click();
	}
}

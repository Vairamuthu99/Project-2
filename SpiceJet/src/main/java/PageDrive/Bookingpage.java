package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.Utilclass;

public class Bookingpage extends Utilclass {

	WebDriver driver;

	public Bookingpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa'])[1]")
	WebElement Oway;

	@FindBy(xpath = "(//input[@dir='auto'])[1]")
	WebElement FmDes;

	@FindBy(xpath = "(//input[@dir='auto'])[2]")
	WebElement ToDes;

	@FindBy(xpath = "(//div[@style='font-family: inherit;'])[128]")
	WebElement DDate;

	@FindBy(xpath = "//div[@data-testid='home-page-flight-cta']")
	WebElement SFlight;

	@FindBy(xpath = "//div[@data-testid='continue-search-page-cta']")
	WebElement Con;

	@FindBy(xpath = "(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-poiln3 r-ubezar r-j2kj52'])[1]")
	WebElement Tit;

	@FindBy(xpath = "(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar'])[1]")
	WebElement Mr;

	@FindBy(xpath = "//input[@data-testid='first-inputbox-contact-details']")
	WebElement Fname;

	@FindBy(xpath = "//input[@data-testid='last-inputbox-contact-details']")
	WebElement Lname;

	@FindBy(xpath = "//input[@data-testid='contact-number-input-box']")
	WebElement Mob;

	@FindBy(xpath = "//input[@data-testid='emailAddress-inputbox-contact-details']")
	WebElement Emi;

	@FindBy(xpath = "//select[@class='form-control form-select']")
	WebElement Cty;

	@FindBy(xpath = "//input[@data-testid='city-inputbox-contact-details']")
	WebElement Twn;

	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[5]")
	WebElement PPc;

	@FindBy(xpath = "//div[@data-testid='traveller-info-continue-cta']")
	WebElement Cbn;

	public void Oneway() {
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

	public void Continue() {
		Con.click();
	}

	public void Title() {
		Tit.click();
		Mr.click();
	}

	public void FirstName(String FirstName) {
		Fname.sendKeys(FirstName);
	}

	public void LastName(String LastName) {
		Lname.sendKeys(LastName);
	}

	public void Mobile(String Mobile) {
		Mob.sendKeys(Mobile);
	}

	public void Email(String Email) {
		Emi.sendKeys(Email);
	}

	public void Country(String Country) {
		Cty.sendKeys(Country);
	}

	public void Town(String Town) {
		Twn.sendKeys(Town);
	}

	public void Mark() {
		PPc.click();
	}

	public void ContinueButton() {
		Cbn.click();
	}

}







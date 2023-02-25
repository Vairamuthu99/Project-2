package PageDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityDrive.Utilclass;


public class Signuppage extends Utilclass{
	
	WebDriver driver;

	public Signuppage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@to='https://spiceclub.spicejet.com/signup'])[1]")
	WebElement Sup;
	
	@FindBy(xpath = "//select[@class='form-control form-select ']")
	WebElement Tit;
	
	@FindBy(xpath = "(//option[@value='MR'])[1]")
	WebElement Mr;
	
	@FindBy(xpath = "//input[@id='first_name']")
	WebElement Fname;
	
	@FindBy(xpath = "//input[@id='last_name']")
	WebElement Lname;
	
	@FindBy(xpath ="//select[@class='form-control form-select']")
	WebElement Con;
	
	@FindBy(xpath ="//input[@id='dobDate']")
	WebElement DOB;
	
	@FindBy(xpath ="//input[@placeholder='+91 01234 56789']")
	WebElement Mob;
	
	@FindBy(xpath ="//input[@id='email_id']")
	WebElement Emi;
	
	@FindBy(xpath ="//input[@id='new-password']")
	WebElement Pas;
	
	@FindBy(xpath ="//input[@id='c-password']")
	WebElement Cpas;
	
	public void Signupbt() {
		Sup.click();
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
	
	public void Country(String Country) {
		Con.sendKeys(Country);
	}
	
	public void Dateob(String Dateob) {
		DOB.sendKeys(Dateob);
	}
	
	public void Mobile(String Mobile) {
		Mob.sendKeys(Mobile);
	}
	
	public void Email(String Email) {
		Emi.sendKeys(Email);
	}
	
	public void Password(String Pass) {
		Pas.sendKeys(Pass);
	}
	
	public void Cpassword(String Cpass) {
		Cpas.sendKeys(Cpass);
	}
}

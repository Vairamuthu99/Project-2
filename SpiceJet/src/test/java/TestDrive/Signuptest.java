package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.Baseclass;
import PageDrive.Signuppage;


public class Signuptest extends Baseclass {
	
	@Test
	public void Signup() {

		Signuppage signup = new Signuppage(driver);
		signup.Signupbt();
		Switchclass();
		signup.Title();
		signup.FirstName(prop.getProperty("FirstName"));
		signup.LastName(prop.getProperty("LastName"));
		signup.Country(prop.getProperty("Country"));
		signup.Dateob(prop.getProperty("Dateob"));
		signup.Mobile(prop.getProperty("Mobile"));
		signup.Email(prop.getProperty("Email"));
		signup.Password(prop.getProperty("Password"));
		signup.Cpassword(prop.getProperty("Cpassword"));
	}

}

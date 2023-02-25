package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.Baseclass;
import PageDrive.Loginpage;


public class Logintest extends Baseclass {

	@Test
	public void Login() {

		Loginpage login = new Loginpage(driver);
		login.Login("msvairamuthu1999@gmail.com", "Vairam@99");
	}
}

package TestDrive;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseDrive.Baseclass;
import PageDrive.Validationpage;


public class Validationtest extends Baseclass {

	@Test
	public void ValidationOnElement1() {

		Validationpage vp = new Validationpage(driver);
		Assert.assertTrue(vp.CheckIn());
	}

	@Test
	public void ValidationOnElement2() {

		Validationpage vp = new Validationpage(driver);
		Assert.assertTrue(vp.FlightStatus());
	}

	@Test
	public void ValidationOnElement3() {

		Validationpage vp = new Validationpage(driver);
		Assert.assertTrue(vp.ManageBooking());
	}
}

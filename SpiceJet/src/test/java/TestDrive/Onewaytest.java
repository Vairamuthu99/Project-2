package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.Baseclass;
import PageDrive.Onewaypage;


public class Onewaytest extends Baseclass {

	@Test
	public void OnewayTrip() {

		Onewaypage OnewayTrip = new Onewaypage(driver);
		OnewayTrip.Oneways();
		OnewayTrip.FromOrigin("MAA");
		OnewayTrip.ToDestination("DEL");
		OnewayTrip.DepartureDate();
		OnewayTrip.Searchflight();
	}
}

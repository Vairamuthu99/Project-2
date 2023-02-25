package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.Baseclass;
import PageDrive.Bookingpage;

public class Bookingtest extends Baseclass {

	@Test
	public void BookTicket() {

		Bookingpage booking = new Bookingpage(driver);
		booking.Oneway();
		booking.FromOrigin(prop.getProperty("From"));
		booking.ToDestination(prop.getProperty("To"));
		booking.DepartureDate();
		booking.Searchflight();
		booking.Continue();
		booking.Title();
		booking.FirstName(prop.getProperty("FirstName"));
		booking.LastName(prop.getProperty("LastName"));
		booking.Mobile(prop.getProperty("Mobile"));
		booking.Email(prop.getProperty("Email"));
		booking.Town(prop.getProperty("Town"));
		booking.Mark();
		booking.ContinueButton();
	}
}

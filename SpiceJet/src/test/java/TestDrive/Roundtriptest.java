package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.Baseclass;
import PageDrive.Roundtrippage;


public class Roundtriptest extends Baseclass {
	
	@Test
	public void RoundTrip() {
		
		Roundtrippage roundtrip = new Roundtrippage(driver);
		roundtrip.RoundTrip();
		roundtrip.FromOrigin("MAA");
		roundtrip.ToDestination("DEL");
		roundtrip.DepartureDate();
		roundtrip.ReturnDate();
		roundtrip.Searchflight();
	}
}

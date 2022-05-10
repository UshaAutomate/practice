package exercise;

import org.testng.annotations.Test;

public class MakemytripTestcases extends Actions{
	
	MakemytripLocators ml = new MakemytripLocators();
	
	@Test(priority = 1)
	public void openApplication() {
		
		
		openUrl(ml.url);
		
		String expTitle = driver.getTitle();
		if(ml.actTitle.equals(expTitle)) {
			System.out.println("************Application Opened as Expected************");
		} else {
			System.out.println("--------Application is not Opened as Expected-----------");
		}
	}
	
	@Test(priority = 2, description = "Search for a flight from delhi to Banglore")
	public void search() {
		
		ele(ml.flightmenu).click();
		ele(ml.roundTrip).click();
		click(ml.search);
		
		
	}

}

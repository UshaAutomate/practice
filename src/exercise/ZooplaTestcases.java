package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ZooplaTestcases extends Actions {
	ZooplaLocators zl = new ZooplaLocators();

	@Test(priority = 1, description = "Open Application")
	public void openApplication() {

		openUrl(zl.url);
		String expTitle = driver.getTitle();
		System.out.println(expTitle);

		if (zl.actTitle.equals(expTitle)) {
			System.out.println("Application Opened");
		} else {
			System.out.println("APplication not opened");
		}
		try {
		driver.findElement(By.className("button cookie-banner__button")).click();
		} catch(Exception e) {
			
		}
	}

	@Test(priority = 2, description = "Search the houses in London")
	public void serchTxt() {

		ele(zl.txtSearchEle).sendKeys(zl.txtSearch);
		driver.findElement(By.id("search-submit")).click();
		//click(zl.btnSearch);

	}

	@Test(priority = 3, description = "PriceList in Desecending Order", dependsOnMethods = "serchTxt")
	public void priceList() {

		List<WebElement> li = list(zl.pricelist);
		ArrayList<String> priceList = new ArrayList<String>();

		System.out.println(priceList.size());

		for (int i = 0; i < li.size(); i++) {
			String s = li.get(i).getText();
			String s1 = s.split(" ") [0];
			
			//System.out.println(s1);
			priceList.add(s1);
		}
		
		
		Collections.reverse(priceList);
		System.out.println(priceList);
	}

	@Test(priority = 4, description = "Select 5th house", dependsOnMethods = "serchTxt")
	public void selectHouse() {

		List<WebElement> li = list(zl.listItems);
		
		System.out.println(li.size());
		for (int i = 0; i < li.size();) {

			WebElement item = li.get(i);
			item.findElements(zl.pricelist).get(5).click();
			break;
		}
		//WebElement item  = driver.findElement(zl.listItems);
		//item.findElements(zl.pricelist).get(5).click();
		
		String agentName = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div[5]/section[1]/div/a/div[2]/h4")).getText();
		String agentPno = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div[5]/section[1]/div/p[1]/a")).getText();
		
		System.out.println(agentName + agentPno);
		
		driver.findElement(By.xpath("//*[@id=\"dp-sticky-element\"]/div/div[1]/a/div[2]/h4")).click();
		
		String agentNameMatch = driver.findElement(By.xpath("//*[@id=\"listings-agent\"]/div/p[1]/strong")).getText();
		
		System.out.println(agentNameMatch);
		
		if (agentName.equals(agentNameMatch)) {
			
			System.out.println(" ****************Details of the agent are Correct*********");
		} else {
			System.out.println("---------Not Correct------------");
		}

		
		
		
		
		
		
		

		}
	

}

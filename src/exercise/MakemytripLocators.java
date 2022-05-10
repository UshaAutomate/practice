package exercise;

import org.openqa.selenium.By;

public class MakemytripLocators extends Setup {
	
	String url = "http://www.makemytrip.com";
	String actTitle = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights &amp; Holiday";

	By menuList = By.xpath("//ul[@class = 'makeFlex font12']/li/a");
	By trip = By.xpath("//div[@class = 'makeFlex']/ul/li");
	
	By flightmenu = By.className("active makeFlex hrtlCenter column");
	By roundTrip = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[2]/span");
	By search = By.className("primaryBtn font24 latoBlack widgetSearchBtn ");
	
	
}

package exercise;

import org.openqa.selenium.By;

public class ZooplaLocators {

	public String url = "http://zoopla.co.uk";
	String actTitle = "Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents";

	By txtSearchEle = By.id("search-input-location");
	String txtSearch = "London";

	By btnSearch = By.id("search-submit");

	By pricelist = By.xpath("//a[@class='listing-results-price text-price']");

	By listItems = By.xpath("//*[@id=\"content\"]/ul/li");

	By hotelList = By.className("srp clearfix");
	By photoItem = By.className("photo-hover");

}

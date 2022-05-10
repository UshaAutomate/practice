package exercise;

import org.openqa.selenium.By;

public class CapsuleCRMlocators {
	
	String url = "https://ushaautomation.capsulecrm.com";
	String expTitle = "UshaAutomation CRM";
	By username = By.id("login:usernameDecorate:username");
	By password = By.id("login:passwordDecorate:password");
	
	String uName = "Usha";
	String pwd = "usha123456";
	By btnLogin = By.id("login:login");
	
	By iconpersonadd = By.xpath("//*[@id=\"ember20\"]");
	By personAdd = By.cssSelector(".page-header-right a:nth-child(1)");
	
	By firstName = By.id("party:fnDecorate:fn");
	By lastName = By.id("party:lnDecorate:ln");
	
	By btnSave = By.id("party:save");
	By userVerify = By.className("party-details-title");
	
	By iconCases = By.id("ember29");
	By statusOpen = By.cssSelector(".list-filters-left div:nth-child(1).list-filter .list-select .list-filter-trigger span:nth-child(2)");
	By caseAdd = By.xpath("//a[contains(text(), 'Add Case')]");
	By caseperson = By.cssSelector(".search-select.chunky .search-select__input");
	By casepersonSelect = By.className("search-select__option-party");
	By casename = By.xpath("/html/body/div[3]/div/div[1]/div/form/div/div[3]/div/span/input");
	By casedescription = By.xpath("/html/body/div[3]/div/div[1]/div/form/div/div[4]/div/textarea"); // css .form.chunky .form-field textarea
	By casetag = By.cssSelector(".item-select.chunky input");
	By casetagSelect = By.xpath("//*[@id=\"select-box-el-123\"]/div[2]/div[2]");
	By casetrack = By.id("select-box-el-132");
	By casesave = By.xpath(".form.chunky .form-actions button:nth-child(1)");
	By casepersonVerify = By.cssSelector(".kase-summary-status span");
	
	
	By account = By.id("select-box-el-41");
	By linkAccSetting = By.xpath("//a[contains(text(), 'Account Settings')]");
	By textVerfiy =  By.cssSelector(".settings .settings-content .settings-page-header");
	By accountVerify = By.cssSelector(".settings .settings-content .settings-page-header");
	
	By linkInvoices = By.cssSelector(".nav-panel li:nth-child(2) a");
	By invoicesVerify = By.cssSelector(".page-box-header");
	
	By linkExport = By.id("ember42");
	By exportVerify = By.cssSelector(".settings .settings-content .settings-page-content h1");
	
	By linkAppearence = By.cssSelector(".nav-panel li:nth-child(1) a");
	
	By linkMailbox = By.xpath("//a[contains(text(), 'Mail Drop Box')]");
	
	By linkUsers = By.xpath("//a[contains(text(), 'Users')]");
	By usersVerify = By.cssSelector(".settings .settings-content .settings-page-cta-header");
	
	By linkOpportunities = By.cssSelector(".nav-panel li:nth-child(7) a");
	By opportunitiesVerify = By.cssSelector(".page-box-header");
	
	By linkTracks = By.id("ember48");
	
	
	
	By linkTask = By.xpath("//a[contains(text(), 'Task Categories')]");
	
	By linkCustom = By.xpath("//a[contains(text(), 'Task Categories')]");
	
	By linkTags = By.xpath("//a[contains(text(), 'Tags')]");
	

	By linkIntegrations = By.xpath("//a[contains(text(), 'Integrations')]");
	
	By linkTrash = By.xpath("//a[contains(text(), 'Trash')]");
	
	By acountset = By.className("nav-bar-item nav-bar-account-button");
	By logout = By.cssSelector(".nav-bar ul.pageActions .menu ul li:nth-child(7) a");
	
	
	
	
	
	
	
	
	
	
	

}
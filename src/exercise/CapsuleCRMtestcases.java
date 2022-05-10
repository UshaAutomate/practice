package exercise;

import org.testng.annotations.Test;

public class CapsuleCRMtestcases extends Actions {
	CapsuleCRMlocators cl = new CapsuleCRMlocators();
	
	
	
	@Test (priority = 1)
	public void openApp() {
		
			openUrl(cl.url);
		
		String actTitle = driver.getTitle();
		if(actTitle.equals(cl.expTitle)) {
			System.out.println("**************Application is opened as expected");
			log.info("**************Application is opened as expected");
		}
	}
	@Test(priority = 2)
	public void login() {
	
		ele(cl.username).sendKeys(cl.uName);
		ele(cl.password).sendKeys(cl.pwd);
		click(cl.btnLogin);
		
		log.info("Entered Username and Password");
	}
	
	@Test(priority = 3)
	public void addperson() {
		
		click(cl.iconpersonadd);
		//click(cl.btnAdd);
		ele(cl.personAdd).click();
//		click(cl.personAdd);

	}
	
	@Test(priority = 4, dependsOnMethods = "addperson")
	public void addpersons() throws Exception {
		
		String firstName = credentials(2, 1);
		String lastName =  credentials(2, 2);
		
		
		ele(cl.firstName).sendKeys(firstName);
		ele(cl.lastName).sendKeys(lastName);
		
		click(cl.btnSave);
		
		log.info("Adding person details through excelfile");
		
		String user = ele(cl.userVerify).getText();
		String verifyUser = user.split(" ")[0];
		System.out.println(verifyUser);
		
		if(firstName.equals(verifyUser)) {
			
			System.out.println("*************User Added Successfully*************");
			
			log.info("*************User Added Successfully*************");
		} else {
			System.out.println("---------User not added------------");
		}
		
		
	}
	
	@Test(priority = 5)
	public void caseVerify() throws Exception {
		
		click(cl.iconCases);
		
		String caseOpen = ele(cl.statusOpen).getText();
		System.out.println(caseOpen);
		
		if(caseOpen.equalsIgnoreCase("Open")) {
			
			System.out.println("***********Successfully opend cases");
			
			log.info("***********Successfully opend cases");
			
		} else {
			System.out.println("---------not Successfully opened cases");
		}
		
		click(cl.caseAdd);
		try {
		
		ele(cl.caseperson).sendKeys(credentials(2, 1) + " " +credentials(2, 2));
		click(cl.casepersonSelect);
		ele(cl.casename).sendKeys("testlog");
		ele(cl.casedescription).sendKeys(" need to report");
		ele(cl.casetag).sendKeys("Test1");
		click(cl.casetagSelect);
		click(cl.casetrack);
		click(cl.casesave);
		
		String personVerify = ele(cl.casepersonVerify).getText();
				
				if(personVerify.equalsIgnoreCase("open")){
					System.out.println("*************Case successfully Added");
					
					log.info("*************Case successfully Added");
					
					
				} else {
					System.out.println("-------------Case Successfully NOT Added");
				}
		
		
		} catch(Exception e) {
			System.out.println(e.getMessage());
			log.error("..........");
		}
	}
	
	@Test(priority = 6)
	public void accountSettingsVerify() {
		
		click(cl.account);
		click(cl.linkAccSetting);
		String expacVerify = "Acdfdfdcount";
		String actacVerify = ele(cl.accountVerify).getText();
		if(expacVerify.contentEquals(actacVerify)) {
			
			System.out.println("************Account Verified");
			log.info("************Account Verified");
			
		} else {
			System.out.println("-----------Account not Verified");
		}
		
		click(cl.linkInvoices);
		String expInvoice = "Invoices";
		String actInvoic = ele(cl.invoicesVerify).getText();
		verify(expInvoice,actInvoic );
		
		
		click(cl.linkExport);
		String expExport = "Export";
		String actExport = ele(cl.exportVerify).getText();
		verify(expExport, actExport);
		
		click(cl.linkAppearence);
		String expAppearence = "Appearance";
		String actAppearence = ele(cl.textVerfiy).getText();
		verify(expAppearence, actAppearence);
		
		click(cl.linkMailbox);
		String expDropbox = "Mail Drop box";
		String actDropbox = ele(cl.textVerfiy).getText();
		verify(expDropbox, actDropbox );
		
		click(cl.linkUsers);
		String expUsers = "Users";
		String actUsers = ele(cl.usersVerify).getText();
		verify(expUsers, actUsers );
		
		click(cl.linkOpportunities);
		String expOpportunities = "Opportunities";
		String actOpportunities = ele(cl.opportunitiesVerify).getText();
		verify(expOpportunities, actOpportunities );
		
		click(cl.linkTracks);
		String expTracks = "Tracks";
		String actTracks = ele(cl.textVerfiy).getText();
		verify(expTracks, actTracks);
		
		click(cl.linkTask);
		String expTask = "Task";
		String actTask = ele(cl.textVerfiy).getText();
		verify(expTask, actTask);
		
		click(cl.linkCustom);
		String expCustom = "Custom";
		String actCustom = ele(cl.textVerfiy).getText();
		verify(expCustom, actCustom);
		
		click(cl.linkTags);
		String expTagss = "Tdfsdfagsxdd";
		String actTagss = ele(cl.textVerfiy).getText();
		verify(expTagss, actTagss );
		
		click(cl.linkIntegrations);
		String expIntegrations = "Integrations";
		String actIntegrations = ele(cl.textVerfiy).getText();
		verify(expIntegrations, actIntegrations );
		
		click(cl.linkTrash);
		String expTrash = "Integrations";
		String actTrash = ele(cl.textVerfiy).getText();
		verify(expTrash, actTrash );
		
		
		
		
		
	}
	
	@Test(priority = 7)
	public void logout() {
		
		click(cl.acountset);
		click(cl.logout);
		
		log.info("Logged out of the application");
	}
		
	}


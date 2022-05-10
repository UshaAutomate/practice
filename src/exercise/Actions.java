package exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.log4testng.Logger;

public class Actions extends Setup {
	
	FileInputStream fis;
	Workbook wb;
	Row row;
	Sheet sh;

	Logger log = Logger.getLogger(Actions.class.getClass());
	
	public void openUrl(String url) {
		driver.get(url);
	}

	public void click(By Locator) {
		 driver.findElement(Locator).click();
		
	}
	
	public List<WebElement> list(By Locator){
		List<WebElement> li = driver.findElements(Locator);
		return li;
	}
	
	public WebElement ele(By Locator) {
		return driver.findElement(Locator);
	}
	
	public String credentials(int rowno, int cellno) throws Exception {
		
		
			//String filePath = System.getProperty("user.dir");
			fis = new FileInputStream(new File("C:\\Users\\Tejas\\eclipse-workspace\\practicePrograms\\drivers\\persons.xlsx"));
			wb = new XSSFWorkbook(fis);
			sh = wb.getSheet("Sheet1");
			
			String value = sh.getRow(rowno).getCell(cellno).getStringCellValue();
			
			
			return value;
		
	}
	
	public String verify(String actValue, String expValue) {
		
		if(actValue.contentEquals(actValue)) {
			System.out.println(actValue + "******Verified");
			
			log.info(actValue + " **********Verified"); 
			
		} else {
			
			System.out.println(actValue + "------ Not Verified");
			log.info(actValue + " **********Not Verified"); 

		}
		return actValue;
		
	}
	
	
}

package annotation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DyanamicDataProvider extends BaseClass{
	
	@Test(dataProvider="SourceData")
	public void runCreateLead(String company,String fName,String lName,String pHno) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pHno);
		driver.findElement(By.name("submitButton")).click();
		
	}
	@DataProvider(name="SourceData")
	public String[][] provideData() throws IOException {
		
		ReadExcel excel = new ReadExcel();
		String[][] readData = excel.readData();
		return readData;
	}
	
}
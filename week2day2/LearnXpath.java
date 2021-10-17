package week2.day2;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();

	    //driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");

	    //driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthick");

	    //driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Essakky");
	    
	    WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    //eleSource.sendKeys("Conference");
	    Select dropDown = new Select(eleSource);
	    dropDown.selectByVisibleText("Direct Mail");
	    //dropDown.selectByIndex(4);
	    //dropDown.selectByValue("LEAD_PARTNER");
	    
	    WebElement eleIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
	    Select dropDown2 = new Select(eleIndustry);
	    dropDown2.selectByIndex(7);
	    //dropDown2.selectByValue("IND_TELECOM");
	    
	    WebElement eleOwnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	    Select dropDown3 = new Select(eleOwnership);
	    dropDown3.selectByValue("OWN_PARTNERSHIP");

	    WebElement eleMarketCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	    eleMarketCampaign.sendKeys("Affiliate Sites");
	    
	}
	
}
package week2.day2;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.findElement(By.xpath("//a[@style='color: black;']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();

	    driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("ABC");

	    driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Karthick");

	    driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Essakky");
	    
	    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	    
	}
	
}
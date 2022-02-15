package week4day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
		
		Set<String> winHandle = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>(winHandle);
		driver.switchTo().window(winList.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@class='linktext'][1]")).click();
		
		driver.switchTo().window(winList.get(0));
		
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		Set<String> str2 = driver.getWindowHandles();
		List<String> winList2 = new ArrayList<String>(str2);
		driver.switchTo().window(winList2.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		driver.switchTo().window(winList2.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();	
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println(driver.getTitle());
		
	}
}
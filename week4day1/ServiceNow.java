package week4day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev93904.service-now.com/navpage.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame("gsft_main");
		
		driver.findElement(By.xpath("//label[text()='User name']/following::input")).click();
		driver.findElement(By.xpath("//label[text()='User name']/following::input")).sendKeys("admin");
		driver.findElement(By.xpath("//label[text()='User name']/following::input[2]")).click();
		driver.findElement(By.xpath("//label[text()='User name']/following::input[2]")).sendKeys("Dz5mFbRuPB1s");
		driver.findElement(By.id("sysverb_login")).click();
		
		driver.findElement(By.xpath("//input[@id='filter']")).click();
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("incident",Keys.DOWN.ENTER);
		driver.findElement(By.xpath("//span[text()='Incident']/following::div[text()='All'][1]")).click();
		
		driver.findElement(By.xpath("//div[text()='Create New']")).click();
		driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame("gsft_main");
		
		driver.findElement(By.id("sys_display.incident.caller_id")).sendKeys("Abraham Lincoln",Keys.DOWN.ENTER);
		
		driver.findElement(By.id("incident.short_description")).sendKeys("Hi there! I am abel Tuter");
		
		String str = driver.findElement(By.id("incident.number")).getAttribute("value");
		
		System.out.println(str);
		
		driver.findElement(By.xpath("//span//button[text()='Submit']")).click();
		//driver.findElement(By.id("1889603f1b9730100a61fc86cc4bcbdf_text")).sendKeys(str,Keys.DOWN.ENTER);
		//driver.findElement(By.id("lookup.incident.caller_id")).click();
		
		//Set<String> winHandle = driver.getWindowHandles();
		//List<String> winList = new ArrayList<String>(winHandle);
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//driver.switchTo().window(winList.get(1));
		//System.out.println(driver.getTitle());
		//Thread.sleep(2000);
		
		//driver.findElement(By.id("/html/body/div[1]/div[1]/span/div/div[5]/table/tbody/tr/td/div/table/tbody/tr[1]/td[3]/a")).click();
	}

}
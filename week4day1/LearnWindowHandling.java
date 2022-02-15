package week4day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		//Alert alert = driver.switchTo().alert();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		Set<String> windowHandle = driver.getWindowHandles();
		List<String> listSet = new ArrayList<String>(windowHandle);
		System.out.println("Count of window opened :"+listSet.size());
		driver.switchTo().window(listSet.get(1));
		System.out.println(driver.findElement(By.xpath("//a[@href='mailto:flights@irctc.co.in']")).getText());
		
	}

}
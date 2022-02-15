package week4day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import freemarker.ext.beans._BeansAPI._BeansWrapperSubclassFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class AssignmentAmazon {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String pricePhone = driver.findElement(By.xpath("//a[@class='a-size-base a-link-normal a-text-normal']//span")).getText();
		System.out.println("The Price of the phone is: "+pricePhone);
		String ratingCustomers = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div/div[2]/div/span[2]/a/span")).getText();
		System.out.println("The total number of Customer rated: "+ratingCustomers);
		WebElement hover = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div/div[2]/div/span[1]/span/a/i[1]"));
		hover.click();
		Actions ratingPhone = new Actions(driver);
		ratingPhone.moveToElement(hover).perform();
		String ratingPercent = driver.findElement(By.xpath("//*[@id=\"histogramTable\"]/tbody/tr[1]/td[3]/span[2]/a")).getText();
		System.out.println("The 5 star rating percentage is: "+ratingPercent);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[1]/div/div/span/a/div/img")).click();
		
		Set<String> winHandle = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>(winHandle);
		driver.switchTo().window(winList.get(1));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./snaps/mobPic.png");
		FileUtils.copyFile(screenshotAs, dst);
		
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		
		//driver.findElement(By.id("nav-cart-count")).click();
	}

}
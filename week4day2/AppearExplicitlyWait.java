package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppearExplicitlyWait {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/appear.html");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement button = driver.findElement(By.id("btn"));
		wait.until(ExpectedConditions.visibilityOf(button));
		String str = driver.findElement(By.id("btn")).getText();
		System.out.println("The text is:"+str);
	}

}
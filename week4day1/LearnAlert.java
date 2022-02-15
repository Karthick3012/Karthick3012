package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//AlertBox
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		//confirmBox
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		String text2 = alert.getText();
		System.out.println(text2);
		alert.dismiss();
		
		//promptBox
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		String text3 = alert.getText();
		alert.sendKeys("Hello Alert Box");
		System.out.println(text3);
		alert.dismiss();
	}

}
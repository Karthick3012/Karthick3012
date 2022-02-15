package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentNykaa {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.nykaa.com/");
		
		WebElement hoverBarnds = driver.findElement(By.xpath("//*[text()='brands']"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(hoverBarnds).perform();
		
		driver.findElement(By.xpath("//a[@href='/brands/loreal-paris/c/595?eq=desktop']")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@class='css-0']//button[1]")).click();
		driver.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]")).click();
		driver.findElement(By.xpath("//*[@class='filter-open css-nbw8dp']")).click();
		driver.findElement(By.xpath("//*[@id=\"custom-scroll\"]/ul/li[1]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"custom-scroll\"]/ul/li/ul/li/div")).click();
		
		
		driver.findElement(By.xpath("//div[@class='control-value']/following-sibling::div")).click();
		driver.findElement(By.xpath("//*[@id=\"filters-strip\"]/div/div/div[6]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"custom-scroll\"]/div/div[4]/label/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"product-list-wrap\"]/div[1]/div/div[1]/a/div[1]/img")).click();
		Set<String> winHandle = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>(winHandle);
		driver.switchTo().window(winList.get(1));
		String priceShampoo = driver.findElement(By.xpath("//span[@class='css-1888qy']/following-sibling::span[1]")).getText();
		System.out.println("The Price Of Shampoo is: "+priceShampoo);
		driver.findElement(By.xpath("//span[@class='btn-text']")).click();
		driver.findElement(By.xpath("//div[@id='app']//button[@class='css-5s18zx eoh7kvv0']")).click();
		
		WebElement iframe = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(iframe);
		
		String grandTotal = driver.findElement(By.xpath("//span[text()='Grand Total']/following-sibling::div")).getText();
		System.out.println("The Grand total is: "+grandTotal);
		
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		String checkGrandTotal = driver.findElement(By.xpath("(//div[@class='value']//span)[2]")).getText();
		if (grandTotal.contains(checkGrandTotal)) {
			System.out.println("Both the grand totals are same: "+checkGrandTotal);
		} else {
			System.out.println("Grand totals are not same!!!");
		}
		driver.quit();
		
	}

}
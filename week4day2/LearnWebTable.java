package week4day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement webTElement = driver.findElement(By.id("table_id"));
		
		List<WebElement> tableRow = webTElement.findElements(By.tagName("tr"));
		
		System.out.println("No of rows :"+ tableRow);
		WebElement firstRow = tableRow.get(1);
		
		List<WebElement> tableCol = firstRow.findElements(By.tagName("td"));
		System.out.println("No of columns:"+tableCol.size());
		for (WebElement eachRowElement : tableRow) {
			System.out.println(eachRowElement.getText());
		}
		for (int i = 0; i < args.length; i++) {
			WebElement row = tableRow.get(i);
			List<WebElement> col = row.findElements(By.tagName("td"));
			String colText = col.get(1).getText();
			System.out.println("Content of column :"+colText);
		}

	}

}
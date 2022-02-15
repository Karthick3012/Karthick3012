package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en_old.Ac;
import io.github.bonigarcia.wdm.WebDriverManager;
@SuppressWarnings("unused")
public class LearnDragAndDrop {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame1);
		
		WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(drag, drop).perform();
		
	}

}
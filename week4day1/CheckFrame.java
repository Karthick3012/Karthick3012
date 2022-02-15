package week4day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class CheckFrame {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leafground.com/pages/frame.html");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='default.html']"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.id("Click")).click();
		
		java.io.File screenShotAs = driver.getScreenshotAs(OutputType.FILE);
		
		File fle = new File("./snap/pic1.png");
		FileUtils.copyFile(screenShotAs, fle);
		
		driver.switchTo().defaultContent();
		
		int size = driver.findElements(By.tagName("iframe")).size();
		
		ArrayList<Integer> frameSize = new ArrayList<Integer>();
		frameSize.add(size);
		System.out.println("The total number of frames is: "+frameSize.size());
	}

}
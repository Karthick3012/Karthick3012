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
@SuppressWarnings("unused")
public class AssignmentSnapdeal {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.snapdeal.com/");
		
		WebElement hoverMensFation = driver.findElement(By.xpath("//div[@id='leftNavMenuRevamp']/div[1]/div[2]/ul[1]/li[7]/a[1]/span[1]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(hoverMensFation).perform();
		driver.findElement(By.xpath("//*[@id=\"category6Data\"]/div[1]/div/div/p[2]/a/span")).click();
		String nOfShoes_Mens = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[2]/div[2]/div[3]/h1/span")).getText();
		System.out.println("The Total number of Sport shoes are: "+nOfShoes_Mens);
		driver.findElement(By.xpath("//*[@id=\"js-255-nav\"]/li[1]/a/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[2]/div[2]/div[3]/div[2]/div/div")).click();
		WebElement isSele = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[2]/div[2]/div[3]/div[2]/ul/li[2]"));
		isSele.click();
		
		String sortBy = "Price Low To High";
		String text = driver.findElement(By.xpath("//*[@class='sort-selected']")).getText();
		System.out.println(text);
		if(text.contains(sortBy)) {
			System.out.println("The sort by value is: "+text);
		}
		else {
			System.out.println("The sorted value is not: "+text);
		}
		WebElement price1 = driver.findElement(By.xpath("//div[@class='price-text-box']//input"));
		String num = "900";
		price1.clear();
		price1.sendKeys(num);
		WebElement price2 = driver.findElement(By.xpath("(//div[@class='price-text-box']//input)[2]"));
		String num2 = "1200";
		price2.clear();
		price2.sendKeys(num2);
		driver.findElement(By.xpath("//div[contains(@class,'price-go-arrow btn')]")).click();
		//driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
		/*String fliters = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[2]/div[2]/div[7]/div[1]")).getText();
		System.out.println("The filters are :"+fliters);
		WebElement hover2 = driver.findElement(By.xpath("//*[@id=\"655630021713\"]"));
		
		Actions builder2 = new Actions(driver);
		builder2.moveToElement(hover2).perform();
		driver.findElement(By.xpath("//*[@id=\"655630021713\"]/div[2]/div/div")).click();
		
		Set<String> winHandle = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>(winHandle);
		driver.switchTo().window(winList.get(1));
		
		String text2 = driver.findElement(By.xpath("//*[@id=\"sidebar_modal_right\"]/div[2]/div[4]/div/div/div[2]/div[3]/div[2]/div[2]/span[1]")).getText();
		System.out.println(text2);*/
	}

}
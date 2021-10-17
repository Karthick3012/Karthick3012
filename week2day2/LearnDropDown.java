package week2.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnDropDown {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();

        String text =driver.findElement(By.tagName("h2")).getText();
        System.out.println(text);

        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

        driver.findElement(By.id("password")).sendKeys("crmsfa");

        driver.findElement(By.className("decorativeSubmit")).click();

        driver.findElement(By.linkText("CRM/SFA")).click();

        driver.findElement(By.linkText("Leads")).click();

        driver.findElement(By.linkText("Create Lead")).click();

        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");

        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthick");

        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Essakky");

        WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));

        //driver.findElement(By.name("submitButton")).click();

    }
}
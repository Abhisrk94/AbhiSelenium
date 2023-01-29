package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Dropdown_example
{
@Test
    public void dropdown()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
        driver.findElement(By.xpath("//a[text()='Sign In']")).click();
        driver.findElement(By.xpath("//a[text()='Register Now!']")).click();
        WebElement ele=driver.findElement(By.xpath("//select[@name='account.languagePreference']"));
        Select s=new Select(ele);
        s.selectByVisibleText("japanese");
        WebElement ele1=driver.findElement(By.xpath("//select[@name='account.favouriteCategoryId']"));
        Select d=new Select(ele1);
        d.selectByValue("DOGS");





    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.edge.EdgeDriver;

/**
 *
 * @author The flash
 */
public class TestTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  
    public void invokeBrowser() {
        try {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\The flash\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
//            ChromeOptions options = new  ChromeOptions();
//            options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
            driver = new EdgeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//            driver.get("http://localhost:8080/BookBus/register.jsp");
           
            Thread.sleep(1000);
            test();
            Thread.sleep(1000);
            adminOperation();
            Thread.sleep(1000);
           // managerOperation();
           // completeRegistration();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
  
  public void test() {
   driver.get("http://localhost:8080/BookBus/register.jsp");
    driver.manage().window().setSize(new Dimension(1382, 754));
    driver.findElement(By.id("firstName")).click();
    driver.findElement(By.id("firstName")).sendKeys("Alvaro");
    driver.findElement(By.id("lastName")).click();
    driver.findElement(By.id("lastName")).sendKeys("Eric");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("alvaro@gmail.com");
    driver.findElement(By.id("phoneNumber")).click();
    driver.findElement(By.id("phoneNumber")).sendKeys("+250785047581");
    driver.findElement(By.id("companyName")).click();
    driver.findElement(By.id("companyName")).sendKeys("Auca");
    driver.findElement(By.id("companySize")).click();
    {
      WebElement dropdown = driver.findElement(By.id("companySize"));
      dropdown.findElement(By.xpath("//option[. = '1 - 10']")).click();
    }
    driver.findElement(By.id("companySize")).click();
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("123456");
    driver.findElement(By.id("passwordConfirm")).click();
    driver.findElement(By.id("passwordConfirm")).sendKeys("123456");
    driver.findElement(By.cssSelector(".py-3")).click();
    driver.close();
  }
  public void adminOperation(){
    driver.get("http://localhost:8080/BookBus/adminlogin.jsp");
    driver.manage().window().setSize(new Dimension(1382, 754));
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys("super@gmail.com");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("super@pass");
    driver.findElement(By.cssSelector(".bg-indigo-500")).click();
    driver.findElement(By.cssSelector("div:nth-child(3) > .w-full")).click();
    driver.close();
  }
   public static void main(String[] args) {
        TestTest tes = new TestTest();
        tes.invokeBrowser();
    }
}


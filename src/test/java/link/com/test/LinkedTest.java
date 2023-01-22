package link.com.test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LinkedTest {
    
    private WebDriver driver;
    private String baseUrl;
    
    public LinkedTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
       System.setProperty("webdriver.chrome.driver", "/Users/rachid/NetBeansProjects/data/chromedriver/chromedriver");
        driver = new ChromeDriver();
       

        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testFirstTestCase() throws Exception {
    driver.get("https://www.linkedin.com/login");
    driver.manage().window().maximize() ;
    driver.findElement(By.id("username")).sendKeys("linktestng@yahoo.com");
    driver.findElement(By.id("password")).sendKeys("Group3project");
    driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
    WebDriverWait wait = new WebDriverWait(driver, 30);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ember177\"]"))).click();


    
}
}


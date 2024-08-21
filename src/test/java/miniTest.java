import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class miniTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\belalahmad\\IdeaProjects\\MiniProject2\\src\\test\\resources\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://amazon.in");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @Test
    public void verifyTitle()
    {
        String actualTitle=driver.getTitle();
        String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test
    public void verifyLogo()
    {
       boolean flag= driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).isDisplayed();
       Assert.assertTrue(flag);

    }

    @Test
    public void searchProduct() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("MackBook");
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"nav-search-submit-button\"]")));
        searchButton.click();
        Thread.sleep(5000);
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}

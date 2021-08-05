package testCase;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GooglePage;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.openqa.selenium.support.*;
import pages.SberleasingPage;

public class TestSberLeasing {
  public static WebDriver driver;
  public static GooglePage googlePage;
  public static SberleasingPage sberleasingPage;

  @BeforeClass
  public  static void setupBefor() {
    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    driver = new ChromeDriver();
    googlePage = new GooglePage(driver);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); }

    @Test
    public void testTask(){


    googlePage.inputSearchField("СберЛизинг");
    googlePage.clickSearchButton();
    driver.findElement(By.xpath("//h3[text()='СберЛизинг — официальный сайт лизинговой компании ...']")).click();
      System.out.println(driver.getCurrentUrl());
      sberleasingPage = new SberleasingPage(driver);
      System.out.println(driver.getCurrentUrl());
      sberleasingPage.clickSearchButton();





    }

  //    public void closePopupIfVisible() {
  //      try {
  //        driver.findElement(By.xpath("//div[@class='comagic-call-generator comagic-call-generator--left-place ']/div[5]")).click();
  //      }
   //     catch (Exception e) {

    //  }
   // }

@AfterClass
    public static void setupAfter(){
    //driver.quit();
}

}

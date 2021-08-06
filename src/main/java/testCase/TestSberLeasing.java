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
    public static void setupBefor() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        googlePage = new GooglePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testTask() {

        driver.get("https://google.ru");
        googlePage.inputSearchField("СберЛизинг");
        googlePage.clickSearchButton();
        googlePage.clickResults();
        sberleasingPage = new SberleasingPage(driver);
        System.out.println(driver.getCurrentUrl());
        sberleasingPage.clickSearchButton();
    }

    @AfterClass
    public static void setupAfter() {
        driver.quit();
    }

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SberleasingPage {

        private static WebDriver driver;
        public SberleasingPage(WebDriver driver){

        PageFactory.initElements(driver,this);
        this.driver = driver; }

    @FindBy(xpath = "//a[contains(text(),"Подобрать по параметрам")]")
    private WebElement selectionButton;

    public void clickSearchButton(){
        selectionButton.click();  }





    }

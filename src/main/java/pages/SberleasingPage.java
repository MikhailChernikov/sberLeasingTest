package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SberleasingPage {


        public WebDriver driver;
        public SberleasingPage(WebDriver driver){

            PageFactory.initElements(driver,this);
            this.driver = driver; }

    @FindBy(xpath = "/html/body/div[1]/section[1]/div/div/div[3]/a")
    private WebElement selectionButton;

    public void clickSearchButton(){
        selectionButton.click();  }





    }

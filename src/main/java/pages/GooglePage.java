package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

    public WebDriver driver;
    public GooglePage(WebDriver driver){

        PageFactory.initElements(driver,this);
        this.driver = driver; }

	@FindBy(xpath="//input[@name='q']")
	private WebElement searchField;

    @FindBy(xpath="//input[@name='btnK']")
    private WebElement searchButton;


	@FindBy(xpath = "//h3[text()='СберЛизинг — официальный сайт лизинговой компании ...']")
	private WebElement results;

    public void inputSearchField(String searchtext){
        searchField.sendKeys(searchtext); }

    public void clickSearchButton(){
        searchButton.click();  }

    public void clickResults(){
        results.click();
    }



}

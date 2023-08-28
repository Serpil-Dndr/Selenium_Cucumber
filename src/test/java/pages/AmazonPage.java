package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage(){
        //save web element
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id = "twotabsearchtextbox")
    public WebElement amazonSearchBox;
    @FindBy (xpath = "//a[@class='btn btn-sign-in-simple']")
    public WebElement homePageSighInButton ;

    @FindBy(id="login-email")
    public WebElement loginPageEmailTextbox;

    @FindBy(xpath = "//button[@class='btn red radius-5 mt-4 w-100']")
    public WebElement loginPageButton;

    @FindBy(xpath = "//a[text()='My courses']")
    public WebElement verifyMycourses;
    @FindBy(xpath = "//p[text()='Provide your valid login credentials']")
    public WebElement enterYourValidCredText;

    @FindBy(xpath = "//div[@class='a-section aok-relative s-image-square-aspect']")
    public WebElement firstProductOFSearch;


    @FindBy(xpath = "//a[text()='My cqqqqqqqqqqqqqqqqqqqqqqqqqqqourses']")
    public WebElement verifyMycourses;
    @FindBy(xpath = "//p[text()='Provide your valid logiqqqqqqqqqqn credentials']")
    public WebElement enterYourValidCredText;

}

package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class QdSetepDefinitions {
QdPage qdPage= new QdPage();
    @Then("User click on qdhomepage login button")
    public void user_click_on_qdhomepage_login_button() {
       qdPage.homePageSighInButton.click();
    }
    @Then("user enters an email to emailTextBox")
    public void user_enters_an_email_to_email_text_box() {
    qdPage.loginPageEmailTextbox.sendKeys(ConfigReader.getProperty("qdValidUserName"));
    }
    @Then("user enters password to passwordTexBox")
    public void user_enters_password_to_password_tex_box() {
     qdPage.loginPagePasswordTextbox.sendKeys(ConfigReader.getProperty("qdValidPassword"));
    }
    @Then("user click on loginPage login button")
    public void user_click_on_login_page_login_button() {
       qdPage.loginPageButton.click();
    }
    @Then("test that user is able to log in")
    public void test_that_user_is_able_to_log_in() {
        Assert.assertTrue(qdPage.verifyMycourses.isDisplayed());
    }

    @Then("user enters an {string} to emailTextBox")
    public void user_enters_an_to_email_text_box(String desiredEmail) {
        qdPage.loginPageEmailTextbox.sendKeys(ConfigReader.getProperty(desiredEmail));
    }

    @Then("user enters {string} to passwordTexBox")
    public void user_enters_to_password_tex_box(String desiredPassword) {
        qdPage.loginPagePasswordTextbox.sendKeys(ConfigReader.getProperty(desiredPassword));
    }

    @Then("test that user could not  able to log in")
    public void test_that_user_could_not_able_to_log_in() {
        Assert.assertTrue(qdPage.loginPageEmailTextbox.isDisplayed());
    }

    @Then("closes the page")
    public void closes_the_page() {
        Driver.closeDriver();
    }


}

package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage =new AmazonPage();
    @Given("User goes to amazon homepage")
    public void user_goes_to_amazon_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
    }

    @Then("User searches for Nutella in search box")
    public void user_searches_for_nutella_in_search_box() {
        amazonPage.amazonSearchBox.sendKeys("Nutella"+ Keys.ENTER);
    }

    @Then("Test that result text contains Nutella word")
    public void test_that_result_text_contains_nutella_word() {
        String expectedWords= "Nutella";
        String actualWords = amazonPage.amazonResult.getText();
        Assert.assertTrue(actualWords.contains(expectedWords));
    }

    @Then("Closes the page")
    public void closes_the_page() {
        Driver.closeDriver();
    }

}

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
    @Given("User goes to amazon page")
    public void userGoesToAmazonPage() {
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


    @Then("User searches for tea pot in  search box")
    public void user_searches_for_tea_pot_in_search_box() {
        amazonPage.amazonSearchBox.sendKeys("Tea Pot"+ Keys.ENTER);
    }

    @Then("Test that result text contains TeaPot  word")
    public void test_that_result_text_contains_tea_pot_word() {
        String expectedWords= "Tea Pot";
        String actualWords = amazonPage.amazonResult.getText();
        Assert.assertTrue(actualWords.contains(expectedWords));

    }

    @Then("User searches for {string} in search box")
    public void userSearchesForInSearchBox(String word) {
        amazonPage.amazonSearchBox.sendKeys(word +Keys.ENTER);

    }

    @And("Test that result text contains {string} word")
    public void testThatResultTextContainsWord(String word) {
        String expectedWords= word;
        String actualWords = amazonPage.amazonResult.getText();
        Assert.assertTrue(actualWords.contains(expectedWords));
    }

    @Then("User searches for flower in  search box")
    public void userSearchesForFlowerInSearchBox() {
        amazonPage.amazonSearchBox.sendKeys("Flower"+ Keys.ENTER);
    }

    @And("Test that result text contains flower  word")
    public void testThatResultTextContainsFlowerWord() {
        String expectedWords= "Flower";
        String actualWords = amazonPage.amazonResult.getText();
        Assert.assertTrue(actualWords.contains(expectedWords));
    }


    @Given("User goes to {string} page")
    public void userGoesToPage(String desiredURL) {
        Driver.getDriver().get(ConfigReader.getProperty(desiredURL));
    }

    @Then("Test that URL has {string} word")
    public void testThatURLHasWord(String urlWord) {
       String actualURL = Driver.getDriver().getCurrentUrl();
       String expectedURL= urlWord;
       Assert.assertTrue(actualURL.contains(expectedURL));
    }
}
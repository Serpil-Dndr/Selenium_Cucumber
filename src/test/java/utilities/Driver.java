package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    static WebDriver driver;

    public static WebDriver getDriver() {
//        if (driver == null) {
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
//            return driver;
//        }
//        return driver;
        String browser = ConfigReader.getProperty("browser");

        if(driver==null) {
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;

                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

            }
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;
    }

    // to close opened driver // if a driver is opened, this method will close it. If there is no drider, it wont do anything



    //to close open driver
    public static void closeDriver() {
        if (driver != null) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
            driver.close();
            driver = null;
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
            driver.quit();

            driver = null;
        }
    }
}
package CustomFramework.utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class DriverManager {
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver == null) {
            // set properties
            // this line download the necessary webdriver
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
//            WebDriverManager.chromedriver().setup();
//              WebDriverManager.firefoxdriver().setup();

            // configure chrome options here
            ChromeOptions options = new ChromeOptions();
//              FirefoxOptions options = new FirefoxOptions();

            options.addArguments("--start-maximized");
            options.addArguments("--disable-notifications");
            options.addArguments("--remote-allow-origins=*");

            // initialize the driver
            driver = new ChromeDriver(options);
//              driver = new FirefoxDriver(options);
        }
        return driver;
    }
}

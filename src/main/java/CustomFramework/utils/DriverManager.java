package CustomFramework.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver == null) {
            //Set properties
            //Line to download the driver manually
            //System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
            WebDriverManager.chromedriver().setup();

            // configure chrome options here
            ChromeOptions options = new ChromeOptions();

            options.addArguments("--start-maximized");
            options.addArguments("--disable-notifications");
            options.addArguments("--remote-allow-origins=*");//necessary for the driver's error

            // initialize the driver
            driver = new ChromeDriver(options);
        }
        return driver;
    }
}

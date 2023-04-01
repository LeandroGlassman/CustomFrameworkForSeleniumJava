package CustomFramework.utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverManager {
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver == null) {
            // set properties
            WebDriverManager.chromedriver().setup();

            // configure chrome options here
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--disable-notifications");

            // initialize the driver
            driver = new ChromeDriver(options);
        }
        return driver;
    }
}

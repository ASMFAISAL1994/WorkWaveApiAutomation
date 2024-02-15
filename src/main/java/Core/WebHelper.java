package Core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class WebHelper {
    WebDriver driver;
    public WebDriver browser(){
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        Map<String, Object> profile = new HashMap<String, Object>();
        Map<String, Integer> contentSettings = new HashMap<String, Integer>();

        // SET CHROME OPTIONS
        // 0 - Default, 1 - Allow, 2 - Block
        contentSettings.put("notifications", 2);
        contentSettings.put("geolocation", 2);
        profile.put("managed_default_content_settings", contentSettings);
        prefs.put("profile", profile);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--remote-allow-origins=*");
//        options.addArguments("--disable-blink-features=AutomationControlled");


        WebDriverManager.chromedriver().setup();
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--headless");
         driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        driver.get("https://www.daraz.com.bd/");
//        options.setExperimentalOption("debuggerAddress","localhost:9222 ");

        driver.get("https://apps.roboket.com/");


       driver.manage().window().maximize();
        return driver;
    }
}


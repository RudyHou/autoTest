package autoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openBrowser {
    public static WebDriver openChrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        WebDriver useChrome = new ChromeDriver();
        return useChrome;
    }
    public static WebDriver openFirefox(){
        WebDriver useFirefox = new FirefoxDriver();
        return useFirefox;
    }
}

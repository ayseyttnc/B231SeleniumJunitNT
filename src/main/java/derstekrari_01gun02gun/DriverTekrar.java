package derstekrari_01gun02gun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverTekrar {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/");
        Thread.sleep(5000);
        driver.quit();


        WebDriverManager.edgedriver().setup();
        WebDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://www.youtube.com/");
        edgeDriver.quit();

        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://google.com");
        chromeDriver.quit();

        WebDriverManager.firefoxdriver().setup();
        WebDriver fireFoxDriver = new FirefoxDriver();
        fireFoxDriver.get("http://google.com");
        fireFoxDriver.quit();

    }
}

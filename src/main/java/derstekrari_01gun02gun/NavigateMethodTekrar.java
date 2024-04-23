package derstekrari_01gun02gun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethodTekrar {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.techproeducation.com/");
        Thread.sleep(6000);
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        Thread.sleep(6000);
        driver.navigate().forward();
        Thread.sleep(6000);
        driver.navigate().refresh();
        driver.quit();
    }

}

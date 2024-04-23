package derstekrari_01gun02gun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseManageMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        System.out.println("driver.manage().window() = " + driver.manage().window());
        Thread.sleep(5000);
        driver.manage().window().minimize();
        Thread.sleep(4000);
        driver.manage().window().maximize();
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());
        Thread.sleep(5000);
        driver.manage().window().fullscreen();
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());
        driver.quit();


    }
}

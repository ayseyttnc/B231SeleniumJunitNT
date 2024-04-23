package derstekrari_01gun02gun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseGetMethodu {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.com/");
        String actualTitle =driver.getTitle();
        System.out.println(actualTitle);
        if (actualTitle.contains("amazon")){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }
        String actualURL=driver.getCurrentUrl();
        System.out.println(actualURL);
        if (actualURL.contains("amazon")){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }
        String windowHandle= driver.getWindowHandle();
        System.out.println(windowHandle);
        String amazonPageSource= driver.getPageSource();
        if (amazonPageSource.contains("Gateway")){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }
        driver.quit();
    }
}

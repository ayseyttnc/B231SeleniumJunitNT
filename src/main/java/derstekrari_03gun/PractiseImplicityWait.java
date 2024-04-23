package derstekrari_03gun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PractiseImplicityWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://www.amazon.com/");
        String expectedData = "Amazon";
        String actualData = driver.getTitle();
        if (actualData.contains(expectedData)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("test failed");
        }
        driver.get("http://www.walmart.com/");
        String expectedData1 = "Walmart";
        String actualData1 = driver.getTitle();
        if (actualData1.contains(expectedData1)) {
            System.out.println("Test Passed");

        } else {
            System.out.println("Test Failed");
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.quit();
    }
}

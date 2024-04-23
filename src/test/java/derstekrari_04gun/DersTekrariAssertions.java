package derstekrari_04gun;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DersTekrariAssertions {
    @Test
    void test1() {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://allovercommerce.com/");
String expectedData="ALLOVER";
String actualData=driver.getTitle();
Assertions.assertEquals(expectedData,actualData);
    }

}

package day04_assertions_webelements_locaters;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_AssertionsTest {


    // Go to Google Website
    // Verify that the page url is https://www.google.com/
    // Close the page


    // Google Web sitesine gidin
    // Sayfa basliginin Google oldugunu dogrulayin
    // Sayfayi kapatin


    // Google Web sitesine gidin
    // Sayfa url nin https://www.google.com/ oldugunu dogrulayin
    // Sayfayi kapatin

// Go to Google Website
    //Verify that the page title is Google
    // Close the page



    WebDriver driver;
    @BeforeEach
    void setUp() {
        // Google Web sitesine gidin
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.google.com/");
    }

    @Test
    void testPageTitle() {
        // Sayfa basliginin Google oldugunu dogrulayin
        String expectedData="Google";
        String actualData=driver.getTitle();
        Assertions.assertEquals(expectedData,actualData);
    }

    @Test
    void testUrl() {
        // Sayfa url nin https://www.google.com/ oldugunu dogrulayin
        String expectedUrl="https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expectedUrl,actualUrl);
    }

    @AfterEach
    void tearDown() {
        // Sayfayi kapatin
        driver.quit();
    }
}


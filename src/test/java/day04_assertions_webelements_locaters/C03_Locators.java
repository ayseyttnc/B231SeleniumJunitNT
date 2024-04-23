package day04_assertions_webelements_locaters;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Locators {
    //Go to Amazon page
    //Locate the search box and print and search for iPhone
    //close the page


    @Test
    void test01() throws InterruptedException {
        //Amazon sayfasına gidiniz

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        NOT:
       /* Eger bir arama kutusunu locate edip bir text gonderirsek 2 sekilde enter tusuna basabaliriz
                1) submit() method
                2) Keys.ENTER

                //1 YOL
                WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iphone");
        searchBox.submit();

        //2.yol
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);


         */

        //Arama kutusunu locate ediniz ve iphone yazdırıp aratınız
Thread.sleep(5000);
        //3.yol name Attribute

        driver.findElement(By.name("field-keywords")).sendKeys("iphone", Keys.ENTER);

        //sayfayı kapatınız
       // driver.quit();
    }
}

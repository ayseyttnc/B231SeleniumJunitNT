package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        // go to techproeducation homepage https://www.techproeducation.com/
        //Go to Amazon page. https://www.amazon.com/
        //Go back to techproeducation page
        //Go to Amazon page again
        //Refresh the page
        //Close all pages

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        // techproeducation ana sayfasina gidelim . https://www.techproeducation.com/
        driver.navigate().to("https://www.techproeducation.com/");
        //Amazon soyfasina gidelim. https://www.amazon.com/
        Thread.sleep(3000);
        driver.navigate().to("https://www.amazon.com/");

        //Tekrar techproeducation sayfasina donelim
        driver.navigate().back();
        Thread.sleep(3000);

        //Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        Thread.sleep(3000);

        //Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
        Thread.sleep(3000);

        //Tum sayfalari kapatalim
        driver.quit();

        /*  Thread.sleep(3000); java dan gelen HARD WAİT tir. Bizler Test Uzmanlari olarak bu waiti kullanmaktan kacinmaliyiz
        Cünkü gereksiz beklemelere neden olur, ilerleyen derslerde Selenium dan gelen DYNAMİC WAİT leri ögreneceğiz
         */
    }
}

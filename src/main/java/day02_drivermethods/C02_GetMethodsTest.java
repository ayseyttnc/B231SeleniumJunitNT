package day02_drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_GetMethodsTest {
    public static void main(String[] args) {
        // Go to TechproEducation page https://www.techproeducation.com/
        // Print the page title
        //Test if the page title contains "IT"
        // Print the page address (url)
        // Test that the page url contains "education".
        //Print the page handle value
        // Test whether the word "IT Programs" appears in the page HTML codes
        // Close the page.
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new ChromeDriver();


        //        TechproEducation sayfasina gidin. https://www.techproeducation.com/
        driver.get(" https://www.techproeducation.com/");

        //        Sayfa basligini(title) yazdirin
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        //        Sayfa basliginin "IT" icerdigini test edin
        if (actualTitle.contains("IT")){
            System.out.println("TestPASSED");
        }else {
            System.out.println("Test FAILed");

        }


        //        Sayfa adresini(url) yazdirin
     String actualURL=   driver.getCurrentUrl();
        System.out.println("actualURL = " + actualURL);

        //        Sayfa url'inin "education" icerdigini test edin.
        if (actualURL.contains("education")){
            System.out.println("TestPASSED");
        }else {
            System.out.println("Test FAILed");

        }
        //        Sayfa handle degerini yazdirin
String windowHandle=driver.getWindowHandle();
        System.out.println(windowHandle);
        //        Sayfa HTML kodlarinda "IT Programs" kelimesi gectigini test edin
    String techproPageSource=    driver.getPageSource();
        System.out.println(techproPageSource);
        if (techproPageSource.contains("IT Programs")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");


    }
        //        Sayfayi kapatin.
        driver.close();//en son driver in oldugu sayfayi kapatir ,oturumu sonlandirmaz
      //  driver.quit();// bizim otomasyon ile actigimiz birden fazla sekmeyi veya pencereyi kapatmak icin kullaniriz ve oturumu sonlandirir
}}

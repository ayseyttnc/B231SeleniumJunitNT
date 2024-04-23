package day01.firstdriversetting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Driver {
    public static void main(String[] args) {
                /*
        ChromeDriver Selenium dan gelen komutlari alir ve bunlari Chrome un anlayacagi sekilde cevirir
        Bunun icin javadan System.setProperty() metohudu ile Selenium a ChromeDriverin konumunu bildirdik
        Böylece ChromeBrowserin doğru sekilde baslatilmasini saglamis olduk
         */


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // bos bir chrome browser acar
        driver.get("https://google.com"); // get () methodu ile string olarak belirtigimiz url e gideriz
        driver.quit(); // oturumu sonlandirir
    }
}

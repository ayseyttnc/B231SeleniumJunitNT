package derstekrari_03gun;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class DersTekrarTestTest {
    @Test
    void test() {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/");
        String actualTitle=driver.getTitle();
        System.out.println("actual title"+actualTitle);
        String actualURL=driver.getCurrentUrl();
        System.out.println(actualURL);
if (driver.getCurrentUrl().contains("youtube")){
    System.out.println("test passed");
}else {
    System.out.println("actualURL"+actualURL);
}
driver.get("https://www.amazon.co.uk/");
driver.navigate().back();
driver.navigate().refresh();
driver.navigate().forward();
driver.manage().window().maximize();
String actualTitle1=driver.getTitle();
        System.out.println("actualTitle1 = " + actualTitle1);
        if (actualTitle1.contains("amazon")){
    System.out.println("test passed");
}else {
    System.out.println("actualTitle1"+actualTitle1);
}
        String actualURl= driver.getCurrentUrl();
        System.out.println("actualURL = " + actualURL);
    }
}
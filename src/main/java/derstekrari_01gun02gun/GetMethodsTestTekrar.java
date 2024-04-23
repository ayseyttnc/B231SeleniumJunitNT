package derstekrari_01gun02gun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodsTestTekrar {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get(" https://www.techproeducation.com/");
        String actualTitle=driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        if (actualTitle.contains("IT")){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }
        String actualURL =driver.getCurrentUrl();
        System.out.println("actualURL = " + actualURL);
        if (actualURL.contains("education")){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }
        String windowHandle= driver.getWindowHandle();
        System.out.println("windowHandle = " + windowHandle);
        String techproPagesource=driver.getPageSource();
        System.out.println(techproPagesource);
        if (techproPagesource.contains("IT")){
            System.out.println("tet passed");
        }else{
            System.out.println("test failed");

        }
        Thread.sleep(6000);

    driver.quit();
    }

}

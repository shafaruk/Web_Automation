import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {


    public static void main(String[] args) throws InterruptedException {
        String driverPath="BrowserDriver/mac/chromedriver";
        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");
        driver.findElement(By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
        Thread.sleep(2000);














    }
}

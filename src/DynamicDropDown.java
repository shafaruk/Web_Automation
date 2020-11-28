import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;//select[@id='ctl00_mainContent_DropDownListCurrency']
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {


    public static void main(String[] args) throws InterruptedException {
        String driverPath="BrowserDriver/mac/chromedriver";
        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='AMD']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='CCU']")).click();




    }
}

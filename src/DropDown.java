import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {


    public static void main(String[] args) throws InterruptedException {
    String driverPath="BrowserDriver/mac/chromedriver";
    System.setProperty("webdriver.chrome.driver",driverPath);
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.spicejet.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
        Select s = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
        s.selectByIndex(4);
        Select c= new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']")));
        c.selectByIndex(2);
        Select i =new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Infant']")));
        i.selectByIndex(1);
        Select cu= new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
        cu.selectByIndex(5);









    }
}

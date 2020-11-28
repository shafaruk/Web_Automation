import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SuggestiveDropDown {

    public static void main(String[] args) throws InterruptedException {
        String driverPath="BrowserDriver/mac/chromedriver";
        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("Ind");
        Thread.sleep(3000);
        List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for( WebElement option:options){

            if(option.getText().equalsIgnoreCase("India"))
            {
                option.click();
                break;
            }
        }
        Thread.sleep(3000);
        driver.close();

    }
}

package amazon;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class HomePage {
    public static void main(String[] args) throws InterruptedException {

        String browserDriverPath="BrowserDriver/mac/chromedriver";
        System.setProperty("webdriver.chrome.driver",browserDriverPath);
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone ");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]/input")).click();
        Thread.sleep(3000);

        String expectResult="Holiday Deals";
        String actualResult=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).getText();
        Assert.assertEquals("Test Fail",expectResult,actualResult);
        driver.findElement(By.xpath("//a[@class='nav-a  ']")).click();
        Thread.sleep(4000);
        driver.close();










    }

}

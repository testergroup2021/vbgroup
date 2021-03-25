import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class selenium

{
    public static void main(String[] args) {
        DesiredCapabilities cap= DesiredCapabilities.chrome();
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        System.setProperty("webdriver.chrome.driver", "c://Chromedriver.exe");
        WebDriver driver = new ChromeDriver(cap);
        driver.get("https://www.google.com");
       // driver.get("http://www.angara.com");
        driver.findElement(By.xpath("\\span[class='CwaK9']")).click();


    }}
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App {

    public static void main(String[] args){ System.out.println("Hello World!");

        System.setProperty("webserver.safari.driver", "/usr/bin/safaridriver");
        WebDriver driver = new SafariDriver();
        driver.get("https://www.youtube.com");

     driver.quit();
        }

    }


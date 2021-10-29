import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ECommerceSearch {

    public void search(){

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        //Driver to go to the website
        driver.get("http://automationpractice.com/index.php");

        //Driver manages the size of the window automation
        driver.manage().window().maximize();

        //Locate and click on search
        WebElement searchButton = driver.findElement(By.id("search_query_top"));
        searchButton.click();

        //Enter search item and click on search
        searchButton.sendKeys("T-shirt");

        //Locate and click on search icon to complete search
        WebElement textbox = driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button"));
        textbox.sendKeys(Keys.ENTER);

        driver.close();
    }

    //main method to run
/*public static void main(String[] args){
    ECommerceSearch test = new ECommerceSearch();
    test.search();
    }

 */
}



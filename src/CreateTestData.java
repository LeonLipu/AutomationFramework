import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by brahmanandakar on 29/11/16.
 */
public class CreateTestData {
    @Test
    public void getTestData(){
        System.out.println("Myname is brahmananda kar");
        // System.setProperty("webdriver.chorme.driver"," chrome.exe");
        System.setProperty("webdriver.chorme.driver"," chromedriver");
       // WebDriver driver=new ChromeDriver();
        //driver.close();


    }
    @Test
    public void SetTestDATA(){
        System.out.println("Myname is brahmananda kar");
        System.setProperty("webdriver.chorme.driver"," chrome.exe");
        System.setProperty("webdriver.chorme.driver"," chromedriver");


    }
}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by brkar on 11/25/2016.
 */
public class Login {

    @Test
    public void getname(){
        System.out.println("Myname is brahmananda kar");
       // System.setProperty("webdriver.chorme.driver"," chrome.exe");
        System.setProperty("webdriver.chorme.driver"," chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.close();


    }
    @Test
    public void setname(){
        System.out.println("Myname is brahmananda kar");
        System.setProperty("webdriver.chorme.driver"," chrome.exe");
        System.setProperty("webdriver.chorme.driver"," chromedriver");


    }
}

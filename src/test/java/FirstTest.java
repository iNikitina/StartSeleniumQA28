import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {

    WebDriver wd;

    @BeforeMethod
    public void precondition(){
        wd =new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
        //login bifore
    }

    @Test(enabled = false )
    public void startGoogle(){
        //wd.get("https://www.google.com/");
        wd.navigate().to("https://www.google.com/");

        //add new contact
    }

    @Test
    public void loginTest(){
        //add new contact
    }
     @AfterMethod
     public void postCondition(){
        //wd.quit();
         wd.close();
         //add new contact
     }


}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest2 {
    WebDriver wd;

    @BeforeMethod
    public void precondition() {
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
    }
    @Test
    public  void homeLogin(){
        wd.findElement(By.cssSelector("[href='/login']")).click();

        WebElement email = wd.findElement(By.cssSelector("[placeholder='Email']"));
        email.click();
        email.clear();
        email.sendKeys("maria8@gmail.com");

        WebElement password = wd.findElement(By.cssSelector("[placeholder='Password']"));
        password.click();
        password.clear();
        password.sendKeys("Mm123456$");

       wd.findElement(By.cssSelector("button:nth-child(4)")).click();

        //open login
        //print to input email
        //print to input password
        //click on login
    }


    @AfterMethod
    public void postCondition(){
         wd.close();
    }

}



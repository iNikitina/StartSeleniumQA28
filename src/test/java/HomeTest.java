import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HomeTest {

    WebDriver  wd;

    @BeforeMethod
    public void precondition(){
        wd= new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
    }

    @Test
    public void aboutTest(){
        List<WebElement> list = wd.findElements(By.tagName("a"));
        System.out.println(list.size());
        int last = list.size()-2;

        WebElement element = list.get(last);
        element.click();

        WebElement element1 = wd.findElement(By.tagName("a"));
        element1.click();

    }

    @AfterMethod
    public void postCondition(){
        wd.close();
    }


}

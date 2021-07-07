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

    @Test
    public void loginTest(){
        wd.findElement(By.linkText("LOGIN")).click();
        List<WebElement> list = wd.findElements(By.tagName("input"));

        WebElement email=list.get(0);
        WebElement password=list.get(1);

        email.click();
        email.clear();
        email.sendKeys("maria8@gmail.com");

        password.click();
        password.clear();
        password.sendKeys("Mm123456$");

        List<WebElement> buttons = wd.findElements(By.tagName("button"));
        buttons.get(0).click();

        //By.tagName
        wd.findElement(By.tagName("a"));
        wd.findElement(By.tagName("h1"));
        wd.findElement(By.tagName("input"));
        wd.findElement(By.tagName("button"));

        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.cssSelector("button"));


        //By.id
        wd.findElement(By.id("root"));
        wd.findElement(By.id("container"));
        wd.findElement(By.id("active"));

        wd.findElement(By.cssSelector("#root"));
        wd.findElement(By.cssSelector("[id='root']"));

        //By.linkText
        wd.findElement(By.linkText("Home"));
        wd.findElement(By.linkText("ABOUT"));
        wd.findElement(By.linkText("HO"));

        wd.findElement(By.cssSelector("[href='/home']"));

        //By.className
        wd.findElement(By.className("container"));
        wd.findElement(By.className("active"));

        wd.findElement(By.cssSelector(".container"));
        wd.findElement(By.cssSelector(".active"));
        wd.findElement(By.cssSelector("[class='active']"));


        wd.findElement(By.cssSelector("[name='namename']"));

        wd.findElement(By.cssSelector("[placeholder='Email']"));
        //начинается ^=
        wd.findElement(By.cssSelector("[placeholder^='Ema']"));
        //заканчивается $=
        wd.findElement(By.cssSelector("[placeholder$='ail']"));
        //содержит *=
        wd.findElement(By.cssSelector("[placeholder*='Ema']"));

    }

    @Test
    public  void homeLogin(){
        WebElement log = wd.findElement(By.cssSelector("[href='LOGIN']"));
        log.click();

        //password.sendKeys("Mm123456$");

        //open login
        //print to input email
        //print to input password
        //click on login
    }

    @AfterMethod
    public void postCondition(){
       // wd.close();
    }


}

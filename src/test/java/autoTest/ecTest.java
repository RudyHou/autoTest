package autoTest;

import autoTest.Animao;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ecTest {
    @Test
    public void logIn(){
        //WebDriver driver = openBrowser.openFirefox();
        WebDriver driver = openBrowser.openChrome();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://10.250.0.66/login");
        WebElement loginName = driver.findElement(By.cssSelector("input[placeholder='请输入账号']"));
        WebElement loginPasswd = driver.findElement(By.cssSelector("input[placeholder='请输入密码']"));
        WebElement yzm = driver.findElement(By.cssSelector("input[placeholder='请输入验证码']"));
        WebElement button = driver.findElement(By.cssSelector("button[type='button']"));
        loginName.sendKeys("testxm");
        loginPasswd.sendKeys("111111");
        yzm.sendKeys("qwer");
        button.click();

        WebElement selectMain = driver.findElement(By.xpath("/html/body/div[1]/section/header/div/div[2]/ul/li[2]"));
        selectMain.click();

        WebElement selectSubmenu = driver.findElement(By.xpath("/html/body/div[1]/section/section/aside/ul/li[1]/span"));
        selectSubmenu.click();

        //WebElement skuCode = driver.findElement(By.xpath("/html/body/div[1]/section/section/main/div[2]/section/form/div[1]/div[1]/div/div/input"));
        //skuCode.sendKeys("sss2220");

        WebElement select = driver.findElement(By.xpath("//*[@id=\"app1\"]/section/section/main/div[2]/section/form/div[1]/div[3]/div/div/div/span/span/i"));
        select.click();

        WebElement selectes = driver.findElement(By.cssSelector(".el-select-dropdown__item"));
        selectes.click();

//        WebElement selected = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[19]"));
//        selected.click();

        WebElement search = driver.findElement(By.xpath("/html/body/div[1]/section/section/main/div[2]/section/form/div[2]/button"));
        search.click();


        try{
            Thread.sleep(10000);
            driver.findElement(By.xpath("/html/body/div/section/header/div/div[3]/span[2]/i")).click();
            driver.quit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void test02(){
        String a = "/html/body/div[1]/section/header/div/div[2]/ul/li[2]";
        String b = "/html/body/div[1]/section/section/aside/ul/li[1]/span";
        String c = "/html/body/div[1]/section/section/main/div[2]/section/form/div[1]/div[1]/div/div/input";
        String d = "sss2220";
        String ee = "/html/body/div[1]/section/section/main/div[2]/section/form/div[2]/button";

        //Animao.logIn(a,b,c,d,ee);

    }

}

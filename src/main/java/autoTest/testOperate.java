package autoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class testOperate {
    //使用火狐浏览器
    //static WebDriver driver = openBrowser.openFirefox();
    //使用谷歌浏览器
    static WebDriver driver = openBrowser.openChrome();
    //使用账号登录，验证码校验已关闭
    public static void logIn(String logName,String passwd,String yZm){
        //WebDriver driver = openBrowser.openFirefox();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://10.250.0.66/login");
        WebElement loginName = driver.findElement(By.cssSelector("input[placeholder='请输入账号']"));
        WebElement loginPasswd = driver.findElement(By.cssSelector("input[placeholder='请输入密码']"));
        WebElement yzm = driver.findElement(By.cssSelector("input[placeholder='请输入验证码']"));
        WebElement button = driver.findElement(By.cssSelector("button[type='button']"));
        loginName.sendKeys(logName);
        loginPasswd.sendKeys(passwd);
        yzm.sendKeys(yZm);
        button.click();
    }
    //选择主菜单
    public static void selectMain(String xpath){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(xpath)).click();
    }
    //选择子菜单
    public static void selectSubmenu(String xpath){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(xpath)).click();
    }
    //选择窗口
    public static void chooseWindows(String css){
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(css)).click();
    }
    //输入框输入
    public static void input(String xpath,String info){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement InputBox = driver.findElement(By.xpath(xpath));
        InputBox.sendKeys(info);
    }
    //清空输入框
    public static void clear(String xpath){
        WebElement clearBox = driver.findElement(By.xpath(xpath));
        clearBox.clear();
    }
    //点击按钮
    public static void ckickButton(String xpath){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(xpath)).click();
    }
    //点击下拉按钮
    public static void dropDown(String css){
        WebElement click = driver.findElement(By.cssSelector(css));
        click.click();
    }
    //下拉选择框
    public static void selectes(String css,String i){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String li = " > li:nth-child("+i+")";
        WebElement select = driver.findElement(By.cssSelector(css+li));
        select.click();
    }
    public static void select(String xpath){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement select = driver.findElement(By.xpath(xpath));
        select.click();
    }
    //点击显示更多按钮
    public static void clickMore(String css){
        WebElement more = driver.findElement(By.cssSelector(css));
        more.click();
    }
    //刷新整个页面
    public static void refresh(){
        try{
            Thread.sleep(3000);
            driver.navigate().refresh();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    //用户退出
    public static void logOut() {
        try{
            Thread.sleep(10000);
            driver.findElement(By.xpath("/html/body/div/section/header/div/div[3]/span[2]/i")).click();
            driver.quit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

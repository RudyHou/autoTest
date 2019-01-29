package autoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class test01 {
    @BeforeTest
    public static void logIn(){
        testOperate.logIn("testxm","111111","abcd");
    }
    @Test
    public static void searchSkucode(){
        String mainXpath = "/html/body/div[1]/section/header/div/div[2]/ul/li[2]";
        testOperate.selectMain(mainXpath);

        String submenuXpath = "/html/body/div[1]/section/section/aside/ul/li[1]/span";
        testOperate.selectSubmenu(submenuXpath);

        String inputXpath = "/html/body/div[1]/section/section/main/div[2]/section/form/div[1]/div[1]/div/div/input";
        String skucode = "sss2220";
        testOperate.input(inputXpath,skucode);

        String searchXpath = "/html/body/div[1]/section/section/main/div[2]/section/form/div[2]/button";
        testOperate.search(searchXpath);

    }
    @Test
    public static void searchSkuid(){
        testOperate.refresh();

        String mainXpath = "/html/body/div[1]/section/header/div/div[2]/ul/li[2]";
        testOperate.selectMain(mainXpath);

        String submenuXpath = "/html/body/div[1]/section/section/aside/ul/li[1]/span";
        testOperate.selectSubmenu(submenuXpath);

        String inputXpath = "//*[@id=\"app1\"]/section/section/main/div[2]/section/form/div[1]/div[2]/div/div/input";
        String skuid = "1000416";
        testOperate.input(inputXpath,skuid);

        String searchXpath = "/html/body/div[1]/section/section/main/div[2]/section/form/div[2]/button";
        testOperate.search(searchXpath);
    }
    @Test
    public static void searchSkuowner(){
        testOperate.refresh();

        String mainXpath = "/html/body/div[1]/section/header/div/div[2]/ul/li[2]";
        testOperate.selectMain(mainXpath);

        String submenuXpath = "/html/body/div[1]/section/section/aside/ul/li[1]/span";
        testOperate.selectSubmenu(submenuXpath);

        String clickButton = "#app1 > section > section > main > div.pag-content > section > form > div:nth-child(1) > div:nth-child(3) > div > div > div.el-input.el-input--small.el-input--suffix > span > span > i";
        testOperate.dropDown(clickButton);

        String selectes = "body > div.el-select-dropdown.el-popper > div.el-scrollbar > div.el-select-dropdown__wrap.el-scrollbar__wrap > ul";
        testOperate.selectes(selectes,"2");

        String searchXpath = "/html/body/div[1]/section/section/main/div[2]/section/form/div[2]/button";
        testOperate.search(searchXpath);
    }
    @AfterTest
    public static void logOut(){
        testOperate.logOut();
    }
}

package autoTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class skuMold {
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
        testOperate.ckickButton(searchXpath);

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
        testOperate.ckickButton(searchXpath);
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
        testOperate.ckickButton(searchXpath);
    }
    @Test
    public static void searchSkuname(){
        testOperate.refresh();

        String mainXpath = "/html/body/div[1]/section/header/div/div[2]/ul/li[2]";
        testOperate.selectMain(mainXpath);

        String submenuXpath = "/html/body/div[1]/section/section/aside/ul/li[1]/span";
        testOperate.selectSubmenu(submenuXpath);

        String clickMorecss = "#app1 > section > section > main > div.pag-content > section > div.pag-search-more.el-row > span";
        testOperate.clickMore(clickMorecss);

        String inputXpath = "//*[@id=\"app1\"]/section/section/main/div[2]/section/form/div[1]/div[4]/div/div/input";
        String skuid = "中国移动山东公司渠道测试";
        testOperate.input(inputXpath,skuid);

        String searchXpath = "/html/body/div[1]/section/section/main/div[2]/section/form/div[2]/button";
        testOperate.ckickButton(searchXpath);
    }
    @Test
    public static void searchSkutype(){
        testOperate.refresh();

        String mainXpath = "/html/body/div[1]/section/header/div/div[2]/ul/li[2]";
        testOperate.selectMain(mainXpath);

        String submenuXpath = "/html/body/div[1]/section/section/aside/ul/li[1]/span";
        testOperate.selectSubmenu(submenuXpath);

        String dropDowncss = "#app1 > section > section > main > div.pag-content > section > div.pag-search-more.el-row > span";
        testOperate.clickMore(dropDowncss);

        String clickButton = "#app1 > section > section > main > div.pag-content > section > form > div:nth-child(1) > div:nth-child(5) > div > div > div > span > span > i";
        testOperate.dropDown(clickButton);

        String selectes = "body > div.el-select-dropdown.el-popper > div.el-scrollbar > div.el-select-dropdown__wrap.el-scrollbar__wrap > ul";
        testOperate.selectes(selectes,"3");

        String searchXpath = "/html/body/div[1]/section/section/main/div[2]/section/form/div[2]/button";
        testOperate.ckickButton(searchXpath);
    }
    @Test
    public static void andSku(){
        testOperate.refresh();

        String mainXpath = "/html/body/div[1]/section/header/div/div[2]/ul/li[2]";
        testOperate.selectMain(mainXpath);

        String submenuXpath = "/html/body/div[1]/section/section/aside/ul/li[1]/span";
        testOperate.selectSubmenu(submenuXpath);

        String andXpath = "//*[@id=\"app1\"]/section/section/main/div[2]/section/div[2]/button[1]";
        testOperate.ckickButton(andXpath);

        String clickButton1 = "#app1 > section > section > main > div.pag-content > div > form > div:nth-child(1) > div > div > div > span > span > i";
        testOperate.dropDown(clickButton1);
        String selectes1 = "body > div:nth-child(5) > div.el-scrollbar > div.el-select-dropdown__wrap.el-scrollbar__wrap > ul";
        testOperate.selectes(selectes1,"4");

        String clickButton2 = "#app1 > section > section > main > div.pag-content > div > form > div:nth-child(2) > div > div > div > span > span > i";
        testOperate.dropDown(clickButton2);
        String selectes2 = "body > div:nth-child(6) > div.el-scrollbar > div.el-select-dropdown__wrap.el-scrollbar__wrap > ul";
        testOperate.selectes(selectes2,"4");

        String skuNamexpath = "//*[@id=\"app1\"]/section/section/main/div[2]/div/form/div[3]/div/div[1]/input";
        String skuName = "自动化新增销售品测试"+commonly.getStringAllDate();
        testOperate.input(skuNamexpath,skuName);

        String tariffXpath = "//*[@id=\"app1\"]/section/section/main/div[2]/div/form/div[4]/div/div[1]/input";
        String tariff = "1";
        testOperate.input(tariffXpath,tariff);

        String skuCodexpath = "//*[@id=\"app1\"]/section/section/main/div[2]/div/form/div[5]/div/div[1]/input";
        String skuCode = commonly.getStringAllDate();
        testOperate.input(skuCodexpath,skuCode);

        String stockXpath = "//*[@id=\"app1\"]/section/section/main/div[2]/div/form/div[6]/div/div/input";
        String stock = "100";
        testOperate.input(stockXpath,stock);

        String extendedCodingXpath = "//*[@id=\"app1\"]/section/section/main/div[2]/div/form/div[7]/div/div/input";
        String extendedCoding = commonly.getStringAllDate();
        testOperate.input(extendedCodingXpath,extendedCoding);

        String clickButton3 = "#app1 > section > section > main > div.pag-content > div > form > div:nth-child(8) > div > label:nth-child(1) > span.el-radio__input";
        testOperate.dropDown(clickButton3);

        String proportionXpath1 = "//*[@id=\"app1\"]/section/section/main/div[2]/div/form/div[9]/div/div[1]/div/div/div/input";
        String proportion1 = "1";
        testOperate.input(proportionXpath1,proportion1);
        String proportionXpath2 = "//*[@id=\"app1\"]/section/section/main/div[2]/div/form/div[9]/div/div[3]/div/div/div/input";
        String proportion2 = "1";
        testOperate.input(proportionXpath2,proportion2);
    }
    @AfterTest
    public static void logOut(){
        testOperate.logOut();
    }
}

package com.amazon.test.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverFactory {
    public static WebDriver driver;
    public DriverFactory()
    {
        PageFactory.initElements(driver,this);
    }
    public void openBrowser() throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\resources\\config.properties");
        properties.load(fileInputStream);
        String url = properties.getProperty("baseurl");
        String browser = properties.getProperty("browser");

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

        if (browser.equalsIgnoreCase("chrome"))
        {
            driver = new ChromeDriver();
            System.out.println("The chrome browser has been invoked");
            driver.manage().window().maximize();
        }
        else if (browser.equalsIgnoreCase("firefox"))
        {
            driver= new FirefoxDriver();
            System.out.println("The firefox browser is invoked");
        }
        else
        {
            System.out.println("Specify browser as chrome");
        }

        driver.get(url);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    public void staticWait(int wait)throws InterruptedException
    {
        Thread.sleep(wait);

    }

    public void closeBrowser()
    {
        //driver.quit();
    }
}

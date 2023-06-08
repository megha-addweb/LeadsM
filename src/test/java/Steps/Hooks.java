package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks
{
    private WebDriver driver;

    @Before(order = 0)
    public void SetUp() throws InterruptedException {
        System.out.println("------------------------------------");
        System.out.println("----- Starting Of The Scenario -----");
        System.out.println("------------------------------------");
        System.setProperty("web-driver.chrome.driver", "/home/addweb/LeadsM/chromedriver");


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.getWindowHandle();
        //driver.manage().window().setSize(new Dimension(1024, 768)); // for change screen size

        driver.get("https://ttstage.addwebprojects.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/form/section/div/div/div/div/div[1]/input[1]")).sendKeys("zalak@addwebsolution.com"); //  saurabhdhariwal.com@gmail.com
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/section/div/div/div/div/div[2]/div[1]/input")).sendKeys("addweb123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/section/div/div/div/div/div[2]/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/header/div[1]/div[1]/div/h2")).getText();
        Thread.sleep(3000);


    }

    @After(order = 1)
    public void TearDown() throws InterruptedException {
        System.out.println("----------------------------------");
        System.out.println("----- Ending Of The Scenario -----");
        System.out.println("----------------------------------");
       // driver.quit();
        Thread.sleep(2000);
    }

    public WebDriver getDriver() {

        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

//    @BeforeStep(order = 1)
//    public void BeforeStep()
//    {
//        System.out.println("-----------------------------------------------");
//        System.out.println("----- This will run before every Scenario -----");
//        System.out.println("-----------------------------------------------");
//    }
//    @AfterStep(order = 1)
//    public void AfterStep(){
//        System.out.println("----------------------------------------------");
//        System.out.println("----- This will run after every Scenario -----");
//        System.out.println("----------------------------------------------");
//    }

}

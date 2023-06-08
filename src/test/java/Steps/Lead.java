package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class Lead {
    WebDriver driver;

    public Lead(Hooks hooks) {
        this.driver = hooks.getDriver();
    }


// User verify
//    @Given("The user is on tt Site")
//    public void the_user_is_on_tt_site() {
//        System.out.println("The user on the site");
//    }
//    @When("The logged user and the user name is same or not")
//    public void the_logged_user_and_the_user_name_is_same_or_not() {
//
//        WebElement loggedInUser = driver.findElement(By.xpath("/html/body/aside/div[2]/div[1]/div[1]/div[1]/div/p"));
//
//        Assert.assertEquals(loggedInUser.getText(),"Saurabh Dhariwal");
//

//        driver.findElement(By.xpath("/html/body/aside/div[2]/div[1]/div[1]/div[1]/div/p")).click();
//        String title = "Saurabh Dhariwal";
//
//        String actualTitle = driver.getTitle();
//
//        System.out.println("Verifying the page title has started");
//        Assert.assertEquals(actualTitle,title,"Page title doesnt match");

//        WebElement welcome = driver.findElement(By.id("dropdownMenuLink"));
//        String Actualvalue = welcome.getText();
//        //System.out.println(welcome.getText());s
//        String Expectedvalue = "Saurabh Dhariwal";
//        if (Actualvalue == Expectedvalue)
//        {
//            System.out.println("Test case passed");
//        }
//        else {
//            System.out.println("Test case failed");
//        }
//        System.out.println("pass");
//    }
//    @Then("The user is continue to process.")
//    public void the_user_is_continue_to_process() {
//
//        System.out.println("User is verify");
//    }


//Create lead:
//    @Given("The user on the site")
//    public void theUserOnTheSite() {
//
//       // driver.findElement(By.xpath("/html/body/header/div[1]/div[2]")).click(); // open menu for tab/phone
//        System.out.println("The user on the site");
//    }
//
//    @When("The user click on Leads option")
//    public void theUserClickOnLeadsOption() throws InterruptedException {
//        System.out.println("The user click on Leads option");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[2]/a")));
//        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[2]/a")).click();
//        Thread.sleep(2000);
//    }
//
//    @Then("The user redirect to Leads page")
//    public void theUserRedirectToLeadsPage() {
//        System.out.println("The user redirect to Leads page");
//    }
//
//    @And("Click on add lead button")
//    public void clickOnAddLeadButton() throws InterruptedException {
//        System.out.println("Click on add lead button");
//        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[1]/div[1]/a")).click();
//        Thread.sleep(1000);
//    }
//
//    @Then("The add lead information page is open")
//    public void theAddLeadInformationPageIsOpen() {
//        System.out.println("The add lead information page is open");
//    }
//
//    @And("Fill all the fields")
//    public void fillAllTheFields() throws InterruptedException {
//
//        System.out.println("Fill all the fields");
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[1]/div/div/select/option[3]")));
//        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[1]/div/div/select/option[3]")).click();
//        System.out.println("Salutation: Mr.");
//        Thread.sleep(2000);
//
//        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[2]/div/input")));
//        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[2]/div/input")).sendKeys("Johnny");
//        System.out.println("Name: johnny");
//        Thread.sleep(2000);
//
//        driver.findElement(By.xpath("//*[@id=\"client_email\"]\n")).sendKeys("johnnyharpertesting000@gmail.com");
//        Thread.sleep(1000);
//
//        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(50));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[4]/div/div[1]/button")));
//        //Select dropdown = new Select(driver.findElement(By.id("agent_id")));
//        //dropdown.selectByVisibleText("Saurabh Dhariwal");
//        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[4]/div/div[1]/select/option[2]")).click();
//        System.out.println("Agent: Rajeev Agrawal");
//        Thread.sleep(2000);
//
//
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(50));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[5]/div/div[1]/button")));
//        Select dropdown1 = new Select(driver.findElement(By.id("source_id")));
//        dropdown1.selectByVisibleText("Friend");
//        //driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[5]/div/div[1]/select/option[3]")).click();
//        Thread.sleep(2000);
//
//
//        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(50));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[6]/div/div[1]/button")));
//        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[6]/div/div[1]/select/option[2]")).click();
//        System.out.println("Lead Category");
//        Thread.sleep(2000);
//    }
//
//    @And("Click on the save button")
//    public void clickOnTheSaveButton() throws InterruptedException {
//        System.out.println("Click on the save button");
//        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[3]/button")).click();
//        Thread.sleep(2000);
//
//       // File LeadsPageScreen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//        //FileUtils.copyFile(LeadsPageScreen, new File("./AllScreenshort/Lead.jpg"));
//
//    }
//
//    @Then("The new lead is create")
//    public void theNewLeadIsCreate() {
//        System.out.println("The new lead is create");
//    }

////Edit leads
//    @Given("The user on the lead page")
//    public void theUserOnTheLeadPage() {
//
//        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[2]/a")).click();
//        System.out.println("User is on the Leads page");
//    }
//
//    @And("user is see the dropdown menu link")
//    public void userIsSeeTheDropdownMenuLink() {
//        System.out.println("user is able to see Dropdown Menu Link");
//    }
//
//    @When("User click on the dropdown menu link")
//    public void userClickOnTheDropdownMenuLink() throws InterruptedException {
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/a")));
//        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/a")).click();
//        Thread.sleep(2000);
//        System.out.println("User clicks on the Dropdown menu link");
//    }
//
//    @And("choose on edit option")
//    public void chooseOnEditOption() throws InterruptedException {
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/div/a[2]")));
//        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/div/a[2]")).click();
//        Thread.sleep(2000);
//        System.out.println("Choose on edit option");
//    }
//
//    @And("Change the lead name")
//    public void changeTheLeadName() throws InterruptedException {
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[2]/div/input")));
//        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[2]/div/input")).sendKeys("Johnny11");
//        System.out.println("Name: johnny11");
//        Thread.sleep(2000);
//
//        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(50));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[4]/div/div[1]/button")));
//        Select dropdown = new Select(driver.findElement(By.id("agent_id")));
//        dropdown.selectByVisibleText("Saurabh Dhariwal");
//        //driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[4]/div/div[1]/select/option[2]")).click();
//        System.out.println("Agent: Saurabh Dhariwal");
//        Thread.sleep(2000);
//    }
//
//    @And("click on save button")
//    public void clickOnSaveButton() throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[3]/button")).click();
//        Thread.sleep(2000);
//        System.out.println("Click on the save button");
//
//    }
//
//    @Then("The lead changes is done")
//    public void theLeadChangesIsDone() {
//        System.out.println("The data is Edit successfully");
//    }

// Search user by id:
//    @Given("The user on the site")
//    public void theUserOnTheSite()
//    {
//        System.out.println("The user on the site");
//    }
//    @And("The user on the leads page")
//    public void the_user_on_the_leads_page() {
//
//        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[2]/a")).click();
//        System.out.println("User is on the Leads page");
//    }
//    @When("user find the user's id")
//    public void user_find_the_user_s_id() throws InterruptedException
//    {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("table-actions")));
//        WebElement buttonLogin = driver.findElement(By.id("table-actions = 'Add Lead']"));
//        Thread.sleep(2000);
//        System.out.println("Button");
//    }
//    @Then("Message user is fine")
//    public void message_user_is_fine() {
//        System.out.println("User is find by user id");
//
//    }

//Delete
//    @Given("User is on the Leads page")
//    public void userIsOnTheLeadsPage()
//    {
//        System.out.println("User is on the Leads page");
//        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[2]/a")).click();
//    }
//
//    @And("user is able to see Dropdown Menu Link")
//    public void userIsAbleToSeeDropdownMenuLink()
//    {
//        System.out.println("user is able to see Dropdown Menu Link");
//    }
//
//    @When("User clicks on the Dropdown menu link")
//    public void userClicksOnTheDropdownMenuLink() throws InterruptedException {
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/a")));
//        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/a")).click();
//        Thread.sleep(2000);
//        System.out.println("User clicks on the Dropdown menu link");
//    }
//
//    @And("Choose on delete option")
//    public void chooseOnDeleteOption() throws InterruptedException {
//        System.out.println("Choose on delete option");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/div/a[3]")));
//        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/div/a[3]")).click();
//        Thread.sleep(2000);
//    }
//
//    @And("Click on yes,delete it option from the pop-up box")
//    public void clickOnYesDeleteItOptionFromThePopUpBox() throws InterruptedException {
//        System.out.println("Click on yes,delete it option from the pop-up box");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[8]/div/div[3]/button[1]")));
//        driver.findElement(By.xpath("/html/body/div[8]/div/div[3]/button[1]")).click();
//        Thread.sleep(2000);
//
//        Actions action = new Actions(driver);
//        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table"));
//        action.moveToElement(element);
//        List<WebElement> rows = driver.findElements(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr"));
//        int Size = rows.size();
//        System.out.println("Total Rows are : "+Size);
//        for (int i = 1; i <= Size; i++)
//        {
//            WebElement rows1;
//            rows1 = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr["+i+"]/td[3]/div/div/h5/a"));
//            String actual_name = rows1.getText();
//
//            System.out.println(actual_name);
//            String expected_name = "Tested123";
//            if (expected_name.equals(actual_name)==true)
//            {
//                System.out.println("The Text is Updated!!!");
//                driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr["+i+"]/td[3]/div/div/h5/a"));
//                driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/a"));
//                break;
//            }
//            else
//            {
//                System.out.println("The Text is not Updated!!!");
//            }
//        }
//    }
//
//
//    @Then("The data is delete successfully")
//    public void theDataIsDeleteSuccessfully()
//    {
//        System.out.println("The data is delete successfully");
//    }

// User search and perform delete operation:
//    @Given("The user on the leads page")
//    public void the_user_on_the_leads_page() {
//        //driver.findElement(By.xpath("/html/body/header/div[1]/div[2]")).click(); // open menu
//        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[2]/a")).click();
//        System.out.println("User is on the Leads page");
//    }
//
//    @When("user find the user's id")
//    public void user_find_the_user_s_id() {
//        if (driver.getPageSource().contains("Rajeev Agrawal")) {
//            System.out.println("Data Matched");
//        } else {
//            System.out.println("Data not Matched");
//        }
//    }
//    @And("check the user id is match or not")
//    public void check_the_user_id_is_match_or_not() {
//
//        WebElement welcome = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[7]"));
//        //String Actualvalue = welcome.getText();
//        //System.out.println(welcome.getText());
//        String Expectedvalue = "Rajeev Agrawal";
//        if (Actualvalue.equals(Expectedvalue))
//        {
//            System.out.println("passed");
//        }
//        else {
//            System.out.println("failed");
//        }
//    }
//
//    @Then("The messaeg is display for user is match")
//    public void the_messaeg_is_display_for_user_is_match() {
//       System.out.println("The message is display for user is match");
//    }
//
//    @When("Click on operation icon")
//    public void click_on_operation_icon() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/a")));
//        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/a")).click();
//        Thread.sleep(2000);
//        System.out.println("User clicks on the Dropdown menu link");
//    }
//
//    @And("choose delete option from drop-down list")
//    public void choose_delete_option_from_drop_down_list() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/div/a[3]")));
//        driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/div/div/div/a[3]")).click();
//        System.out.println("Choose on delete option");
//    }
//    @And("click on pop-up for delete the data")
//    public void clickOnPopUpForDeleteTheData() throws InterruptedException {
//        System.out.println("Click on yes,delete it option from the pop-up box");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[8]/div/div[3]/button[1]")));
//        driver.findElement(By.xpath("/html/body/div[8]/div/div[3]/button[1]")).click();
//        Thread.sleep(2000);
//
//        if (driver.getPageSource().contains("Lead deleted successfully")) {
//            System.out.println("Leads deleted successfully");
//        } else {
//            System.out.println("Leads is not deleted successfully");
//        }
//    }
//    @Then("Message is display the row delete successfully.")
//    public void message_is_display_the_row_delete_successfully()
//    {
//        System.out.println("The row is deleted successfully");
//    }

// Click-in and match time:

    @Given("The user on the TT site")
    public void the_user_on_the_tt_site() {

        System.out.println("The user on the site");
    }

    @And("Click on private dashboard option")
    public void click_on_private_dashboard_option() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[1]/div")));
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[1]/div/a")).click(); //   /html/body/aside/div[2]/div[2]/ul/li[1]/div/a(employee user)
        Thread.sleep(2000);
        System.out.println("User click on Private Dashboard option");
    }
//    @And("Check the clock-in times")
//    public void check_the_clock_in_times() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }


    @And("Click on clock-in button first")
    public void click_on_clock_in_button_first() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[3]/div[1]/div[2]/button")));
        driver.findElement(By.xpath("/html/body/div[1]/section/div[3]/div[1]/div[2]/button")).click();
        Thread.sleep(2000);
        System.out.println("Click on Clock-in button");
    }

    @And("Click on clock-in button from pop-up")
    public void click_on_clock_in_button_from_pop_up() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div[3]/button")));
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button")).click();
        Thread.sleep(2000);
        System.out.println("Click on Clock-in button from Pop-up");
    }

    @Then("The click-in successfully")
    public void the_click_in_successfully() {

        System.out.println("Employee is clock-in successfully");
    }

    @And("Check the clock-in time")
    public void check_the_clock_in_time() throws InterruptedException {
        DateFormat formatData = new SimpleDateFormat("dd");
        Date systemDate = new Date();
        String dateofMonth = formatData.format(systemDate);
        System.out.println(dateofMonth);
        Thread.sleep(2000);
    }


    @And("Match clock-in time with System time")
    public void matchClockInTimeWithSystemTime() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[4]/a"))).click();
        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[4]/div/a[3]")).click();
        Thread.sleep(2000);
        System.out.println("User on Attendance page");


        DateFormat dateFormat = new SimpleDateFormat("d");
        Date systemDate = new Date();
        String dayOfMonth = dateFormat.format(systemDate);
        System.out.println("Day of the month: " + dayOfMonth);

        // Find all the date elements
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div"));  //xpath of attendence module
        action.moveToElement(element);
        List<WebElement> rows = driver.findElements(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/div/table/thead/tr/th")); //xpath of attendence row

        int Size = rows.size();

        System.out.println("Total Rows are : " + Size);
        for (int i = 1; i <= Size; i++) {
            WebElement rows1;
            //rows1 = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[" + i + "]/td[3]/div/div/h5/a"));
            rows1 = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/div/table/thead/tr/th[" + i + "]"));
            String actual_name = rows1.getText();
            System.out.println(actual_name);

            String expectedDayOfMonth = (dayOfMonth);
            if (actual_name.equals(expectedDayOfMonth) == true)
            {

                driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/div/table/tbody/tr/td[" + i + "]")).click();
                Thread.sleep(1000);
                System.out.println("Matched date");


                wait = new WebDriverWait(driver, Duration.ofSeconds(100));
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/div/table/tbody/tr/td["+i+"]/a"))); //--Attendance column xpath
                driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/div/table/tbody/tr/td["+i+"]/a")).click(); //--Attendance column xpath

                Thread.sleep(10000);

                break;

            } else {
                System.out.println("Not Matched");
            }
        }


    }

//    @And("Match clock-in Time")
//    public void matchClockInTime()
//    {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[4]/a"))).click();
//        driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[4]/div/a[3]")).click();
//        Thread.sleep(2000);
//        System.out.println("User on Attendance page");
//
//
//    }

//    @Then("The clock-in time is match")
//    public void the_clock_in_time_is_match()
//    {
//        // Write code here that turns the phrase above into concrete actions
//       System.out.println("Date not match yet");
//    }

}

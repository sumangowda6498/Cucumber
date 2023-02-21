import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Steps{


    private WebDriver driver;

   /* @Before()
    public void setup(){
        System.setProperty("webdriver.edge.driver","C:\\Users\\sumana\\Downloads\\edgedriver_win64\\msedgedriver.exe ");
        //WebDriver driver=new EdgeDriver();
        this.driver = new EdgeDriver();
        driver.manage().window().maximize();
    }*/


    @Given("I am in the login page")
    public void i_am_in_loginpage(){
        System.setProperty("webdriver.edge.driver","C:\\Users\\sumana\\Downloads\\edgedriver_win64\\msedgedriver.exe ");
        //WebDriver driver=new EdgeDriver();
        this.driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        //throw  new io.cucumber.java.PendingException();
    }

    @When("I enter valid {string} and {string}")
    public void i_enter_valid_and(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        //baseUtil.userFullname=userFullName1;
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
        throw new io.cucumber.java.PendingException();
    }


   /* @When("I enter valid {string} and {string}")
    public void i_enter_valid_credentials(String username,String password){

        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("username")).submit();


    }*/

    @Then("I should take to the Overviewpage")
    public void i_take_the_overveiwpage() throws InterruptedException {
        //throw new io.cucumber.java.PendingException();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/h1")).isDisplayed();
        driver.findElement(By.linkText("Log out")).click();
        driver.quit();
    }}
//    @After
//    public void quitBrowser(){
//        driver.quit();
//    }
//}

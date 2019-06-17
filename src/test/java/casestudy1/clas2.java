package casestudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class clas2 {
	WebDriver driver;
	@Given("i want to enter url and open web browser")
	public void i_want_to_enter_url_and_open_web_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		driver = new ChromeDriver();
   	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
    	driver.manage().window().maximize();
	    
	}

	@Given("i want to enter username as admin")
	public void i_want_to_enter_username_as_admin() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	   driver.findElement(By.name("userName")).sendKeys("admin");
	   
	   
	}

	@And("i want to enter an admin password")
	public void i_want_to_enter_an_admin_password() {
		 driver.findElement(By.name("password")).sendKeys("password456");

	   
	}

	@And("i want to click on login")
	public void i_want_to_click_on_login() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button/h4")).click();
		Actions a = new Actions(driver);
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[1]/div")).click();
		a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[2]/div")).click();
		a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//*[@id=\"prodid\"]")).sendKeys("HP");
		driver.findElement(By.name("pricename")).sendKeys("$30000");
		driver.findElement(By.name("Quantity")).sendKeys("6");
		driver.findElement(By.id("brandid")).sendKeys("HP");
		driver.findElement(By.name("description")).sendKeys("it is a good product which has the ratings above 4.5");
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]")).click();
		driver.findElement(By.linkText("SignOut")).click();
	}


	@And("i want fill all mandatory details")
	public void i_want_fill_all_mandatory_details() {
		
		
			}

	

	@Then("i want to click on add product button")
	public void i_want_to_click_on_add_product_button() {
	   
	}

}



package testmeapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class cc18 {
	WebDriver driver;
	WebDriverWait wait;

@Given("i want to open chrome")
public void i_want_to_open_chrome() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
	driver = new ChromeDriver();
	}

@And("open testmeapp")
public void open_testmeapp() {
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.manage().window().maximize();
   
}

@Then("i want to enter username and password")
public void i_want_to_enter_username_and_password() {
	driver.findElement(By.linkText("SignIn")).click();
	driver.findElement(By.id("userName")).sendKeys("Lalitha");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
	driver.findElement(By.name("Login")).submit();
}

@And("click on submit button and do login")
public void click_on_submit_button_and_do_login() {
	driver.findElement(By.name("Login")).submit();
	}

@And("click on add to cart")
public void click_on_add_to_cart() {
	WebElement search=driver.findElement(By.name("products"));
	search.sendKeys("Headphone");	
	driver.findElement(By.cssSelector("body > div.col-md-12.col-sm-12.col-xs-12 > form > input[type=submit]")).click();
	driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9 > div > div > div > div:nth-child(3) > center > a")).click();
	
   
}

@And("make payment")
public void make_payment() {
	driver.findElement(By.cssSelector("#header > div.header-middle > div > div > div.col-sm-8 > div > a:nth-child(2)")).click();
	driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();

    
}

@Then("close")
public void close() {
	driver.close();
    
}


}

package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;


public class Steps {
	
	WebDriver driver;
	
	@Given ("Abrir navegador")
	public void abrir_Chrome() {
		System.out.println("En este paso abre el navegador google chrome");
		System.setProperty("web.driver.chrome", "C:\\Users\\pablo\\OneDrive\\Documentos\\Iplacex\\8vo bimestre\\Integracion Continua\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ced.iplacex.cl/login/index.php");
	}
	
	@When ("ingresa Username {string} y Password {string}")
	public void ingresa_Username_y_Password(String string, String string2) {
		System.out.println("En este paso ingresa las credenciales del usuario");
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
	}
	
	@Then ("inicia sesion")
	public void inicia_sesion() {
		System.out.println("En este paso inicia sesion con los datos del MyTest.feature");
		driver.findElement(By.id("loginbtn")).click();
	}
}

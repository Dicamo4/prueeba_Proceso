import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistroUsu {
	
	private WebDriver driver;
	
	
	By login = By.linkText("login");
	By usuario = By.id("candidate[email]");
	By contrase = By.name("candidate[password]");
	By botoningresa = By.name("btnSubmitLogin");
	
	By registro  = By.linkText("Registrarse");
	By registrob = By.id("email-info_email");
	By registroconfirma = By.id("email-info_emailConfirmation");
	By siguiente = By.id("botonsiguiente" );
	
	By tunombre = By.id("personal-info_firstName");
	By tuapellido = By.id("personal-info_lastName");
	By siguientenom = By.id("botonsiguiente" );
	 
			
	@Before
	public void setUp() throws Exception {
		System.setProperty("webDriver.chrome.driver", "./srs/test/resources/webdriver/windows/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.magneto365.com/choucair");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void login() throws InterruptedException {
		
		driver.findElement(login).click();
		Thread.sleep(2000);
		driver.findElement(usuario).sendKeys("dicamo4@yahoo.es");
		driver.findElement(contrase).sendKeys("Lida1031");
		driver.findElement(botoningresa).click();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void registro() throws InterruptedException {
		
		driver.findElement(registro).click();
		Thread.sleep(2000);
		
		driver.findElement(registrob).sendKeys("bimal98157@farthy.com");
		driver.findElement(registroconfirma).sendKeys("bimal98157@farthy.com");
		driver.findElement(siguiente).click();
		
		driver.findElement(tunombre).sendKeys("Diego QA");
		driver.findElement(tuapellido).sendKeys("test");
		driver.findElement(siguiente).click();
	}
	

}

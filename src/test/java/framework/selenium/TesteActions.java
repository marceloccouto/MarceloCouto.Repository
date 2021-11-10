package framework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TesteActions {

	public static WebDriver driver;

	public static void main(String[] args) {
		TesteClickAndHold();

	}

	public static void TesteTeclado() {
		System.setProperty("webdriver.chrome.driver", "c:/autodrivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		WebElement elementoemail = driver.findElement(By.id("email"));
		WebElement elementopass = driver.findElement(By.id("pass"));

		Actions act = new Actions(driver);

		act.keyDown(elementoemail, Keys.SHIFT).build().perform();
		act.sendKeys(elementoemail, "email@email");

		act.keyUp(elementopass, Keys.SHIFT).build().perform();
		act.sendKeys(elementopass, "marcelo").build().perform();

	}

	public static void TesteActionsMouse() {
		System.setProperty("webdriver.chrome.driver", "c:/autodrivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/login");

		Actions act = new Actions(driver);

		WebElement imputUsername = driver.findElement(By.cssSelector("input[name='username']"));
		WebElement imputSenha = driver.findElement(By.cssSelector("input[name='password']"));
		WebElement butEntrar = driver.findElement(By.cssSelector("button[type='submit']"));

		act.sendKeys(imputUsername, "tomsmith111").build().perform();
		act.doubleClick(imputUsername).build().perform();
		act.sendKeys(imputUsername, "tomsmith").build().perform();
		act.sendKeys(imputSenha, "SuperSecretPassword!").build().perform();
		act.click(butEntrar).build().perform();

	}

	public static void TesteContextoClick() {
		System.setProperty("webdriver.chrome.driver", "c:/autodrivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		Actions act = new Actions(driver);

		WebElement botao = driver.findElement(By.cssSelector("span.context-menu-one"));

		act.contextClick(botao).build().perform();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		act.sendKeys(Keys.ENTER).build().perform();

	}

	public static void TesteClickAndHold() {
		System.setProperty("webdriver.chrome.driver", "c:/autodrivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/login");

		Actions act = new Actions(driver);

		WebElement imputUsername = driver.findElement(By.cssSelector("input[name='username']"));
		WebElement imputSenha = driver.findElement(By.cssSelector("input[name='password']"));
		WebElement butEntrar = driver.findElement(By.cssSelector("button[type='submit']"));

		act.sendKeys(imputUsername, "tomsmith").build().perform();
		act.sendKeys(imputSenha, "SuperSecretPassword!").build().perform();
		act.clickAndHold(butEntrar).build().perform();

	}

}

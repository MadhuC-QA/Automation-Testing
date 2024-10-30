package Amazon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText(
				"Redmi Note 13 Pro (Midnight Black, 8GB RAM, 128GB Storage) | 1.5K AMOLED | 200MP Hi-Res Camera | Flagship 4nm SD 7s Gen 2 | 67W TurboCharge")));

		driver.findElement(By.linkText(
				"Redmi Note 13 Pro (Midnight Black, 8GB RAM, 128GB Storage) | 1.5K AMOLED | 200MP Hi-Res Camera | Flagship 4nm SD 7s Gen 2 | 67W TurboCharge"))
				.click();
		// driver.findElement(By.xpath("//div[@class='a-section a-spacing-none
		// a-padding-none']//input[@id='add-to-cart-button']")).click();
		// input[@aria-labelledby='attach-sidesheet-checkout-button-announce']

		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-labelledby='attach-sidesheet-checkout-button-announce'")));
		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();

		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		// jse.executeScript("window.scrollBy(0,500)");
		driver.findElement(
				By.xpath("//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']"))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")));
		driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")).click();
       Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();

		// The method moveToElement(WebElement) in the type Actions is not applicable
		// for the arguments (By)
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\madhu\\OneDrive\\Pictures\\one.png"));
		driver.findElement(By.id("nav-logo-sprites")).click();
		driver.findElement(By.id("nav-logo-sprites")).click();
		
	
		
		driver.quit();
		driver.close();
		
	}

}

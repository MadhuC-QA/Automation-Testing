import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.linkText("Redmi Note 13 Pro (Midnight Black, 8GB RAM, 128GB Storage) | 1.5K AMOLED | 200MP Hi-Res Camera | Flagship 4nm SD 7s Gen 2 | 67W TurboCharge")).click();
		
		
		
	
		
		
	}

	
	
}

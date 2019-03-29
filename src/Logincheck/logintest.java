package Logincheck;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;


public class logintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aaron\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.navigate().to("https://www.straitstimes.com/");
				driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div[2]/nav/div[2]/div/ul/li[1]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"j_username\"]")).sendKeys("digitaltest9");
				driver.findElement(By.xpath("//*[@id=\"j_password\"]")).sendKeys("Sphdigital1");
				driver.findElement(By.xpath("//*[@id=\"loginForm\"]/button")).click();
				boolean x =driver.findElement(By.xpath("//h2[contains(.,'Top Stories')]")).isDisplayed();
				System.out.println("Is there a top news header:"+x);
				driver.findElement(By.xpath("//h2[contains(.,'Top Stories')]")).click();
				boolean y = driver.findElement(By.xpath("//div[@data-vr-zone='Top Stories 2']//div[@class='file file-image file-image-jpeg']")).isDisplayed();
				System.out.println("Is there any image associated with top news:"+y);
				driver.close();
				

			}
			


	}



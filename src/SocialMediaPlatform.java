import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SocialMediaPlatform {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rania\\OneDrive\\Desktop\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:5500/list.html");
		
		List<WebElement> socialMedia=driver.findElements(By.tagName("option"));
		for(int i=0; i<socialMedia.size(); i++) {
			System.out.println(socialMedia.get(i).getText());
			
		}
		
	}

}

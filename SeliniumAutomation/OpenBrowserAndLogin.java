import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserAndLogin {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\srinivasan.r\\Documents\\Git_srivasan1991\\MyWorkouts\\SeliniumAutomation\\lib\\chromedriver.exe");  
          
        WebDriver driver=new ChromeDriver();  
          
           // Launching the Website la  
        driver.navigate().to("http://www.javatpoint.com/");  
          
         //Maximizing  the browser  
          driver.manage().window().maximize();  
          
          //Scrolling the half of the web page la
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 5000)");   
          
         // Clicking the Spring Boot lin kin the website poorni
        driver.findElement(By.linkText("Spring Boot")).click();  
        //Once opened the spring boot link, it will close the browser automatically poorni
        //driver.close();
  
	}

}

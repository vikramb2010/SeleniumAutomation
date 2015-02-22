
    import org.openqa.selenium.By;  
    import org.openqa.selenium.Keys;  
    import org.openqa.selenium.WebDriver;  
    import org.openqa.selenium.firefox.FirefoxDriver;  
    import org.testng.annotations.BeforeTest;  
    import org.testng.annotations.Test;  
      
    public class Facebook {  
       
   
      
       public static void main(String[] args)
       {
    	   WebDriver driver = new FirefoxDriver();
           
         
      
     
     driver.get("https://facebook.com");  
     
     driver.findElement(By.name("email")).sendKeys(Keys.F5);  
       
   
     driver.findElement(By.name("email")).sendKeys("EmailAddress");  
     driver.findElement(By.name("pass")).sendKeys("password");  
       
          driver.findElement(By.name("pass")).sendKeys(Keys.ENTER);  
       
        }  
    }  

    
package LiveProJect1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.text.Utilities;

public class Module1  {


    @Test
    public void moduleGetTest(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/");
        String expectedTitle="DEMOQA";
        String actualTitle=driver.getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
        driver.quit();



    }
}

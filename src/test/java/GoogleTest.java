import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by goekh on 18.01.2018.
 */
public class GoogleTest {

    WebDriver driver = null;

    @Before
    public void SetUp(){
        driver = new ChromeDriver();
        driver.get("https://www.google.de/");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

    }

    @Test
    public void googleTest()
    {
        this.driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("Hallo");
        this.driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[3]/center/input[1]")).submit();
    }

    @After
    public void TearDown()
    {
        this.driver.close();
    }

}

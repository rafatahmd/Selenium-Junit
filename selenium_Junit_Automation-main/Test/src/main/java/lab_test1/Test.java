package lab_test1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test {
    public static void main(String[] args) throws InterruptedException {
        // Create a new instance of the FireFox driver
        WebDriver driver = new ChromeDriver();

        // Open the website
        String appUrl = "https://www.saucedemo.com/";
        driver.get(appUrl);

        // login page
        driver.findElement(By.id("user-name")).click();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(3000);
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2500);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("shopping_cart_container")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("first-name")).click();
        driver.findElement(By.id("first-name")).sendKeys("Rafat");
        Thread.sleep(2500);
        driver.findElement(By.id("last-name")).click();
        driver.findElement(By.id("last-name")).sendKeys("Ahmed");
        Thread.sleep(2000);
        driver.findElement(By.id("postal-code")).sendKeys("2000");
        Thread.sleep(2000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("finish")).click();
        Thread.sleep(3000);

        // Close browser
        driver.close();
    }
}

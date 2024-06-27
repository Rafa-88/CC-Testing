package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class HomePage extends BasePage {

    public HomePage() {
        super(driver);
    }

    public void navigateToCamperControl(String url) throws IOException {
        navigateToWebPage(url);
    }

    public void verifyPageTitle(String title) {
        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle, title);
    }

    public String buildUrl(String url) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\rafaa\\Documents\\IntelliJDocs\\CamperControl\\src\\main\\resources\\configfiles\\config.properties");
        Properties pr = new Properties();
        pr.load(fr);
        String baseUrl = pr.getProperty("url");
        String homeUrl = pr.getProperty(url);
        return baseUrl + homeUrl;
    }

    public void validateUrl(String url) throws IOException, InterruptedException {
        Thread.sleep(1000);
        String expectedUrl = buildUrl(url);
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }
    public void verifyUrl(String url) throws IOException {
        String expectedUrl = configFileLoad(url);
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    public void clickDropDownOption(String section, String locator) throws IOException {
        String xpathLink = locatorFileLoad(locator);
        String xpath = String.format(xpathLink, section);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement dropDownMenu = driver.findElement(By.xpath(xpath));
        js.executeScript("arguments[0].style.display='block'; arguments[0].style.visibility='visible'; arguments[0].focus();", dropDownMenu);
        wait.until(ExpectedConditions.visibilityOf(dropDownMenu));
        wait.until(ExpectedConditions.elementToBeClickable(dropDownMenu)).click();
    }

}

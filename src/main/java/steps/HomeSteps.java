package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.HomePage;

import java.io.IOException;

public class HomeSteps {

    HomePage landingPage = new HomePage();

    @Given("^El usuario navega a la (.+)$")
    public void iNavigateToCamperControl(String url) throws IOException {
        landingPage.navigateToCamperControl(url);
    }

    @When("^El usuario hace click en el botón de (.+)$")
    public void clickButton(String locator) throws IOException, InterruptedException {
        landingPage.clickElement(locator);
    }

    @Then("^El usuario es dirigido a la página con el título de (.+)$")
    public void verifyAccountsTitle(String title) {
        landingPage.verifyPageTitle(title);
    }

    @When("^El usuario escribe su correo en el cuadro de Email$")
    public void writeText(String username) {
        landingPage.writeEmail(username);
    }

    @When("^El usuario escribe el password en el cuadro de (.+)$")
    public void writePasswordText(String password, String locator) throws IOException {
        landingPage.writePassword(password, locator);
    }

    @Then("^El usuario es dirigido a la sección de (.+)$")
    public void validateLandingUrl(String url) throws IOException, InterruptedException {
        landingPage.validateUrl(url);
    }
    @And("^El usuario es dirigido a la página de (.+)$")
    public void verifyLandingUrl(String url) throws IOException, InterruptedException {
        landingPage.verifyUrl(url);
    }

    @When("^The user clears the (.+)$")
    public void clearTextBox(String locator) throws IOException {
        landingPage.clearText(locator);
    }

    @Then("^The user gets the message (.+)$")
    public void anErrorMessageIsDisplay(String locator) throws IOException {
        WebElement element = landingPage.Find(landingPage.locatorFileLoad(locator));
        Assert.assertTrue(element.isDisplayed());
    }

    @When("^I go to (.+) button using the dropdown (.+)$")
    public void dropDownOptions(String link, String locator) throws IOException {
        landingPage.clickDropDownOption(link, locator);
    }

    @And("^Se muestra el (.+)$")
    public void productsMenuDropdown(String locator) throws IOException {
        landingPage.verifyPresenceOfElement(locator);
    }

    @And("^El usuario selecciona la casilla de (.+)$")
    public void selectCheckbox(String locator) throws IOException {
        landingPage.selectCheckbox(locator);
    }
}

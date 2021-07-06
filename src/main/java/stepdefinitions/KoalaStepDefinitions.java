package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.KoalaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class KoalaStepDefinitions {

    KoalaPage koalaPage=new KoalaPage();

    @Given("Login tusuna basin")
    public void login_tusuna_basin() {
        Driver.getDriver().get(ConfigReader.getProperty("koala_url"));
       koalaPage.GrisButonu.click();
    }

    @Then("{string} adi ve {string} deneyin ve login olmadigini test edin")
    public void adi_ve_deneyin_ve_login_olmadigini_test_edin(String kullanici_adi, String sifreyi) {
        Actions actions=new Actions(Driver.getDriver());
        koalaPage.userName.sendKeys(kullanici_adi + Keys.TAB +sifreyi);
        koalaPage.loginButunu.click();
        String expectedFehler="Username or password is incorrect, please correct them and try again";
        Assert.assertEquals(expectedFehler,koalaPage.errorYazisi.getText());

    }

}

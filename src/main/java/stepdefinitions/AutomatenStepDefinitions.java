package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AutomatPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomatenStepDefinitions {

    AutomatPage automatPage = new AutomatPage();

    @Given("user {string} sayfasina gider")
    public void user_sayfasina_gider(String automation_url) {
        Driver.getDriver().get(ConfigReader.getProperty(automation_url));
    }

    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {
        automatPage.signIn.click();
    }

    @Given("user Create and account bölümüne email adresi girer")
    public void user_create_and_account_bölümüne_email_adresi_girer() {
        automatPage.emailKutusu.sendKeys(ConfigReader.getProperty("email"));

    }

    @Given("Create an Account butonuna basar")
    public void create_an_account_butonuna_basar() {
        automatPage.accoutTiklma.click();


    }

    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(automatPage.firstName).sendKeys(ConfigReader.getProperty("firstName") +
                Keys.TAB +
                ConfigReader.getProperty("lastName") + Keys.TAB + Keys.
                TAB + ConfigReader.getProperty("passWord") + Keys.TAB).perform();
        Select select = new Select(automatPage.dropDay);
        select.selectByIndex(6);
        Select select1 = new Select(automatPage.dropMonth);
        select1.selectByIndex(12);
        Select select2 = new Select(automatPage.dropYears);
        select2.selectByIndex(12);

        actions.moveToElement(automatPage.firstName).click().perform();
        actions.click(automatPage.company).sendKeys(ConfigReader.getProperty("company") + Keys.TAB +
                ConfigReader.getProperty("adress") + Keys.TAB + ConfigReader.getProperty("sehir")+Keys.TAB).perform();



                        /*+ Keys.TAB +
                ConfigReader.getProperty("state") + Keys.TAB + ConfigReader.getProperty("zip")

               /* ConfigReader.getProperty("Country")+
                Keys.TAB + Keys.TAB+Keys.TAB).
                sendKeys("gjsf" + Keys.TAB + Keys.TAB).sendKeys("8752528" + Keys.TAB).perform(); */


    }

    @Given("user Register butonuna basar")
    public void user_register_butonuna_basar() {
 automatPage.registrTiklama.click();
    }

    @Then("hesap olustugunu dogrulayin")
    public void hesap_olustugunu_dogrulayin() {
     //  Assert.assertTrue(automatPage.singOut.isDisplayed());
    }


    @Given("email kutusuna @isareti olmayan email adresi yazar")
    public void email_kutusuna_isareti_olmayan_email_adresi_yazar() {
        automatPage.mailBox.sendKeys("canadngmail.com");
    }

    @Given("enter'a tiklar")
    public void enter_a_tiklar() {
   automatPage.CreatAccountButton.click();
    }

    @Then("error mesajinin “Invalid email address” oldugunu dogrulayin")
    public void error_mesajinin_ınvalid_email_address_oldugunu_dogrulayin() {
      String expectedNachricht="Invalid email address.";
      Assert.assertEquals(expectedNachricht,automatPage.invalidEmailNachricht.getText());

    }

}

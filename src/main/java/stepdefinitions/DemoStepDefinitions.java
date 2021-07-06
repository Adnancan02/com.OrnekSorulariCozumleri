package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.DemoPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoStepDefinitions {

    DemoPage demoPage = new DemoPage();


    @Given("user {string} sayfasinda")
    public void user_sayfasinda(String demo_url) {
        Driver.getDriver().get(ConfigReader.getProperty("demo_url"));
    }

    @Then("Company listesini consola yazdirir")
    public void company_listesini_consola_yazdirir() {

        List<WebElement> companyListe = demoPage.companyListe;
        List<String> liste = new ArrayList<>();

        for (WebElement element : companyListe) {
            liste.add(element.getText());

        }
        System.out.println(liste);
       /* for (WebElement unternehmen:companyListe) {
            String neueListe= unternehmen.getText();
            System.out.println("Sirketler Listesi= "+neueListe);
        }
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//tbody/tr/td[1]"));
        for (WebElement element : elements) {
            String sirketListesi= element.getText();
            System.out.println("Liste="+sirketListesi);

        } */
    }

    @Then("DCB Bank'in listede oldugunu test eder")
    public void dcb_bank_in_listede_oldugunu_test_eder() {

        List<WebElement> companyListe = demoPage.companyListe;
        List<String> liste = new ArrayList<>();
        String expectedCompany = "DCB Bank";
        for (WebElement element : companyListe) {
            liste.add(element.getText());


        }
        Assert.assertTrue(liste.contains(expectedCompany));
        //1.yol
      /*  List<WebElement> companyListe = demoPage.companyListe;
       String expectedCompany="DCB Bank";
        for (WebElement unternehmen:companyListe) {
            String neueListe= unternehmen.getText();

            if(neueListe.equals(expectedCompany)) {
                Assert.assertEquals(neueListe, expectedCompany);
            }
        }
*/
    }

    @Given("{string} Prev.Close degerini yazdiri")
    public void prev_close_degerini_yazdiri(String istenilenSirket) {


 WebElement istenenPrevDegeri=demoPage.istenenCompanyPrevDegeri(ConfigReader.getProperty("istenilenSirket"));
        System.out.println("==================================");
        System.out.println(istenilenSirket +" PrevDegeri = " + istenenPrevDegeri.getText());



    }

}

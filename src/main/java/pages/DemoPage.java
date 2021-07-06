package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoPage {

    public DemoPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//tbody/tr/td[1]")
    public List<WebElement> companyListe;


    public WebElement istenenCompanyPrevDegeri(String istenilenSirket) {

        String sirket = istenilenSirket;
        String istenilenSirketXpath = "//tr[contains(.,'" + sirket + "')]/td[3]"; ////tr[contains(.,'Bata')]/td[3]

        WebElement prevDegeri = Driver.getDriver().findElement(By.xpath(istenilenSirketXpath));


        //   List<WebElement> elements = Driver.getDriver().findElements(By.xpath(istenilenSirketXpath));
        //   return elements;


        return prevDegeri;
    }

}
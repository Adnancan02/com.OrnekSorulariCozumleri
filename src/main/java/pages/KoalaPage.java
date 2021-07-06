package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KoalaPage {
    public KoalaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Log in")
    public WebElement GrisButonu;

    @FindBy(id = "UserName")
    public WebElement userName;

    @FindBy(id = "btnSubmit")
    public WebElement loginButunu;


    @FindBy(xpath = "//li[contains(.,'Username or password is incorrect')]")
    public WebElement errorYazisi;


}

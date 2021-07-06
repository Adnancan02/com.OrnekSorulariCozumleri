package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomatPage {

   public AutomatPage(){
       PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Sign in")
    public WebElement signIn;

   @FindBy(xpath = "//input[@id='email_create']")
    public WebElement emailKutusu;

   @FindBy(xpath = "//button[@id='SubmitCreate']")
    public WebElement accoutTiklma;

   @FindBy(id = "customer_firstname")

    public WebElement firstName;

   @FindBy(id = "days")
    public  WebElement dropDay;

   @FindBy(id = "months")
    public  WebElement dropMonth;

   @FindBy(id = "years")
    public  WebElement dropYears;

   @FindBy(id = "company")
    public WebElement company;

   @FindBy(id = "submitAccount")
    public WebElement registrTiklama;

   // @FindBy(partialLinkText = "Sign out")
   // public WebElement singOut;
   @FindBy(id = "email_create")
   public WebElement mailBox;

    @FindBy(xpath ="//li[text()='Invalid email address.']")
    public WebElement invalidEmailNachricht;

    @FindBy(css = ".icon-user.left")
    public WebElement CreatAccountButton;

}

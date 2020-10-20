package PckMVn.FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterationPage extends pageBase {

	public RegisterationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(name="first_name")
WebElement firstname; 

@FindBy(name="last_name")
WebElement lastname; 

@FindBy(name="fld_email")
WebElement email; 

@FindBy(name="fld_cemail")
WebElement confirmemail;

@FindBy(name="fld_username")
WebElement username;

@FindBy(name="fld_password")
WebElement password;

@FindBy(id="datepicker")
WebElement birthdate;


@FindBy(name="phone")
WebElement phonenumber;

@FindBy(name="address")
WebElement address;

@FindBy(name="city")
WebElement city;

@FindBy (name="state")
WebElement state;



@FindBy(name="zip")
WebElement zipcode;

@FindBy(xpath = "//*[@id=\"contact_form\"]/fieldset/div[14]/div/button")
WebElement registernow;
public void registerMethod(String fname, String lname, String mail , String user, String pass ,String date , String phone , String addr , String cityTXT,String option  ,String zip) 
{
   firstname.sendKeys(fname);
   lastname.sendKeys(lname);
   email.sendKeys(mail);
   confirmemail.sendKeys(mail);
   username.sendKeys(user);
   password.sendKeys(pass);
   birthdate.click();
   birthdate.sendKeys(date);
   phonenumber.sendKeys(phone);
   address.sendKeys(addr);
   city.sendKeys(cityTXT);
   state.click();
   state.sendKeys(option);
   zipcode.sendKeys(zip);
   registernow.click();
   
}
}

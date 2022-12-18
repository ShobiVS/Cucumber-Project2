package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BitesLoginPojo extends BaseClass{
public BitesLoginPojo() {
		PageFactory.initElements(driver, this);
		
	} 
     @FindBy(xpath="//span[@class='']")
     private WebElement account;
    
	
	@FindBy(xpath="(//input[@name='phone'])[1]")
	private WebElement phone;
	
	@FindBy(xpath="(//input[@name='password'])[1]")
	private WebElement pwd;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement login;

	
	@FindBy(xpath="//span[text()='Home']")
	private WebElement home;
	
	@FindBy(xpath="//span[@data-filter='10']")
	private WebElement dosa;
	
	@FindBy(xpath="//button[@class='js-cookie-consent-agree cookie-consent__agree']")
    private WebElement cookies;
	
	public WebElement getCookies() {
		return cookies;
	}
	@FindBy(xpath="//h2[text()='Masala Dosa']")
	private WebElement masaladosa;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement name;
	
	@FindBy (xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="(//input[@autocomplete='phone'])[2]")
	private WebElement phonenum;
	
	@FindBy(xpath="//input[@id='password_reg']")
	private WebElement passwrdreg;
	
	@FindBy(xpath="(//button[@name='login'])[2]")
	private WebElement loginreg;
	
	@FindBy(xpath="//a[@id='lte-top-search-ico']")
	private WebElement searchbtn;
	
	@FindBy(xpath="//h2[text()='Spanish omelet']")
	private WebElement spanish;
	
	@FindBy(xpath="//a[@href='https://bistrobitesdc.com/aboutus']")
	private WebElement Ourstory;
	
	
	public WebElement getOurstory() {
		return Ourstory;
	}

	public WebElement getSpanish() {
		return spanish;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPhonenum() {
		return phonenum;
	}

	public WebElement getPasswrdreg() {
		return passwrdreg;
	}

	public WebElement getLoginreg() {
		return loginreg;
	}

	public WebElement getHome() {
		return home;
	}

	public WebElement getDosa() {
		return dosa;
	}

	public WebElement getMasaladosa() {
		return masaladosa;
	}

	public WebElement getAccount() {
		return account;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogin() {
		return login;
	}
	
	






	
	
	
}
	
	
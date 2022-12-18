package org.stepdefinition;

import org.sample.BaseClass;
import org.sample.BitesLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class BristoBites extends BaseClass{
	@Given("The user enters the testing site")
	public void the_user_enters_the_testing_site() {
		browser();
		windowMaximize();
		launchUrl("https://bistrobitesdc.com/");
	    
	}

	@When("click the “Account” button")
	public void click_the_Account_button() {
		BitesLoginPojo b=new BitesLoginPojo();
		clickBtn(b.getAccount());
	    
	}

	@When("Give the wrong “Username” and “Password”")
	public void give_the_wrong_Username_and_Password() {
		BitesLoginPojo b=new BitesLoginPojo();
		passtext("6895346", b.getPhone());
		passtext("gjysdgfhs", b.getPwd());
	    
	}

	@When("click the “login” button")
	public void click_the_login_button() {
		BitesLoginPojo b=new BitesLoginPojo();
		clickBtn(b.getLogin());
	}



}

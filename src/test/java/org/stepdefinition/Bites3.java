package org.stepdefinition;

import org.sample.BaseClass;
import org.sample.BitesLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Bites3 extends BaseClass {
	@Given("To launch the browser and maximize window")
	public void to_launch_the_browser_and_maximize_window() {
	    browser();
	    windowMaximize();
	    launchUrl("https://bistrobitesdc.com/");
	}

@When("Fill out the registration form with dummy data")
public void fill_out_the_registration_form_with_dummy_data() {
	BitesLoginPojo b=new BitesLoginPojo();
	clickBtn(b.getAccount());
	passtext("Shobi", b.getName());
	passtext("abc@gmail.com", b.getEmail());
	passtext("1234567891",b.getPhonenum() );
	passtext("68765", b.getPasswrdreg());
	
}

@When("Skip the “confirm password” text label")
public void skip_the_confirm_password_text_label() {
	BitesLoginPojo b=new BitesLoginPojo();
	System.out.println("Skipped Confirm Password");
}

@When("click the register button")
public void click_the_register_button() {
	BitesLoginPojo b=new BitesLoginPojo();
	clickBtn(b.getLoginreg());
}



}

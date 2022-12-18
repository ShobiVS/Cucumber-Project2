package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sample.BaseClass;
import org.sample.BitesLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Bites2 extends BaseClass{
	@Given("I am logged in as a user and on the home page")
	public void i_am_logged_in_as_a_user_and_on_the_home_page() {
	    browser();
	    windowMaximize();
	    launchUrl("https://bistrobitesdc.com/");
	}

	@When("I see the “HOME” button on the page and click it")
	public void i_see_the_HOME_button_on_the_page_and_click_it() {
		BitesLoginPojo b=new BitesLoginPojo();
		clickBtn(b.getCookies());
	}

	@When("I see a dropdown labeled “Dosa”")
	public void i_see_a_dropdown_labeled_Dosa() throws InterruptedException {
	    Thread.sleep(2000);
	    BitesLoginPojo b=new BitesLoginPojo();
	    clickBtn(b.getDosa());
		
	}

	@When("Click the dosa button")
	public void click_the_dosa_button() {
		BitesLoginPojo b=new BitesLoginPojo();
		//clickBtn(b.getDosa());
	}

	@When("select the “Masala Dosa” option")
	public void select_the_Masala_Dosa_option() throws InterruptedException {
		Thread.sleep(2000);
		BitesLoginPojo b=new BitesLoginPojo();
		clickBtn(b.getMasaladosa());
	}

	@When("Enter the page and check the “Available Time”")
	public void enter_the_page_and_check_the_Available_Time() {
	    System.out.println("Available Time is from 8.00 am");
	}



}

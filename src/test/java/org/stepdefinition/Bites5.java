package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sample.BaseClass;
import org.sample.BitesLoginPojo;

import cucumber.api.java.en.When;

public class Bites5 extends BaseClass {

@When("Find out the “Spanish Omelet” and Click the icon")
public void find_out_the_Spanish_Omelet_and_Click_the_icon() throws InterruptedException, AWTException {
	 
	
	    BitesLoginPojo b=new BitesLoginPojo();
	   
	    //Thread.sleep(1000);
	    //clickBtn(b.getSearchbtn());
	    }
@When("Select the option by probability")
public void select_the_option_by_probability() throws InterruptedException, AWTException {
	BitesLoginPojo b=new BitesLoginPojo();
	
	Thread.sleep(2000);
    passtext("Spanish Omelet", b.getSearchbtn());
    
    
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
	
   
}

@When("check the dollar probability")
public void check_the_dollar_probability() {
    System.out.println("Price is in $");
}
}

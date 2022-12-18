package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sample.BaseClass;
import org.sample.BitesLoginPojo;

import cucumber.api.java.en.When;

public class Bites4 extends BaseClass{

@When("Click the “search” icon")
public void click_the_search_icon() throws InterruptedException {
	    
	    BitesLoginPojo b=new BitesLoginPojo();
	    Thread.sleep(2000);
	    clickBtn(b.getSearchbtn());
	
    
}

@When("search “Coke”")
public void search_Coke() throws AWTException {
	BitesLoginPojo b=new BitesLoginPojo();
	Robot r=new Robot();
   passtext("Coke", b.getSearchbtn() );
   r.keyPress(KeyEvent.VK_ENTER);
   r.keyRelease(KeyEvent.VK_ENTER);
}

@When("check the can dollar is “$ {double}”")
public void check_the_can_dollar_is_$(Double d) {
    System.out.println("Value of the dollar is"+d);
}

}

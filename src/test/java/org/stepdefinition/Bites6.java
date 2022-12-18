package org.stepdefinition;

import org.sample.BaseClass;
import org.sample.BitesLoginPojo;

import cucumber.api.java.en.When;

public class Bites6 extends BaseClass{
	@When("Click the “Our Story” option")
	public void click_the_Our_Story_option() throws InterruptedException {
		
		BitesLoginPojo b=new BitesLoginPojo();
		
		clickBtn(b.getOurstory());
	    Thread.sleep(2000);
	}

	@When("Check the spelling mistake")
	public void check_the_spelling_mistake() {
	    String s1="customers";
	    String s2="Every Day";
	    boolean str1 = s1.contains("customers");
	    System.out.println(str1);
	    boolean str2 = s1.contentEquals(s2);
	    System.out.println(str2);
	}



}

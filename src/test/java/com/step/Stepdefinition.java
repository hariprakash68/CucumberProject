package com.step;

import org.openqa.selenium.WebDriver;

import com.base.BaseClass;
import com.pom.PomClass;
import com.pom.PomClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Stepdefinition extends BaseClass {
	
	PomClass pc = new PomClass();
	
    //Scenario 1
	@When("User launch the url {string}")
	public void user_launch_the_url(String string) {
	   launchUrl(string);
		
	}
	@And("User clicks on shop men")
	public void user_clicks_on_shop_men() throws InterruptedException {
		Thread.sleep(5000);
		pc.getShopmen().click();
	  
		
	}
	 //Scenario 2
	
	@Given("user click the men wear")
	public void user_click_the_men_wear() throws InterruptedException {
		Thread.sleep(3000);
		moveCursorActions(pc.getMenwear());
	    
	}
	@And("user click the jeans")
	public void user_click_the_jeans() throws InterruptedException {
		Thread.sleep(3000);
		pc.getJeans().click();
	
	    
	}
	
	//Scenario 3
	@Given("user click the any jeans")
	public void user_click_the_any_jeans() throws InterruptedException {
		Thread.sleep(3000);
		pc.getAnyjeans().click();
	   
	}
	@And("user select the size")
	public void user_select_the_size() throws InterruptedException {
		Thread.sleep(3000);
		pc.getSize().click();
	   
	}
	@And("user click the add to cart")
	public void user_click_the_add_to_cart() throws InterruptedException {
		Thread.sleep(3000);
		pc.getAddtocart().click();
	   
	}

}

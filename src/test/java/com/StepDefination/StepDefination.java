package com.StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	
//	@Given("user opnes blank browser")
//	public void user_opnes_blank_browser() {
//		System.out.println("========-----------============----------=======");
//		System.out.println("In Background.");
//	}
//
//	@When("user in on Google page")
//	public void user_in_on_google_page() {
//		System.out.println("Google Scenario Stpe 01");
//	}
//
//	@Then("user validate the home page title")
//	public void user_validate_the_home_page_title() {
//		System.out.println("Google Scenario Stpe 02");
//
//	}
//
//	@When("user is on facebook login page")
//	public void user_is_on_facebook_login_page() {
//		System.out.println("facebook Scenario Stpe 01");
//
//	}
//
//	@Then("user validate the login page title")
//	public void user_validate_the_login_page_title() {
//		System.out.println("facebook Scenario Stpe 02");
//
//		
//	}
//
//	@When("user is no Amezon home page")
//	public void user_is_no_amezon_home_page() {
//		System.out.println("amezon Scenario Stpe 01");
//
//	}



@Given("user opnes blank browser")
public void user_opnes_blank_browser() {

	System.out.println("========-----------============----------=======");
	System.out.println("In Background.");
}

@When("user in on Google page")
public void user_in_on_google_page() {
	System.out.println("google Scenario Stpe 01");

}

@Then("user validate Google home page title")
public void user_validate_google_home_page_title() {
	System.out.println("google Scenario Stpe 02");

}

@When("user is on facebook login page")
public void user_is_on_facebook_login_page() {
	System.out.println("facebook Scenario Stpe 01");

}

@Then("user validate facebook login page title")
public void user_validate_facebook_login_page_title() {
	System.out.println("facebook Scenario Stpe 02");

}

@When("user is on Amezon home page")
public void user_is_on_amezon_home_page() {
	System.out.println("amezon Scenario Stpe 01");

}

@Then("user validate Amezon home page title")
public void user_validate_amezon_home_page_title() {
	System.out.println("amezon Scenario Stpe 02");

}
}

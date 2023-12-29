package com.pom;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class PomClass extends BaseClass {
	
	
	public PomClass() {
		PageFactory.initElements(driver, this);
	}
	
	//Scenario 1
	@FindBy(xpath="//span[text()='SHOP MEN']")
	private WebElement shopmen;

	public WebElement getShopmen() {
		return shopmen;
	}
	
	//Scenario 2
	@FindBy(xpath="(//div[@class='fs13 fwB taC ttU vM dIb ls1 cuP'])[2]")
	private WebElement menwear;

	public WebElement getMenwear() {
		return menwear;
	}
	
	@FindBy(xpath="(//a[text()='jeans'])[1]")
	private WebElement jeans;

	public WebElement getJeans() {
		return jeans;
	}

	@FindBy(xpath="(//img[@loading='eager']//parent::a)[2]")
	private WebElement anyjeans;

	public WebElement getAnyjeans() {
		return anyjeans;
	}
	
	@FindBy(xpath="(//span[@class='br10  bd3  p410 hcP hbxs bxs bs size'])[2]")
	private WebElement size;

	public WebElement getSize() {
		return size;
	}
	@FindBy(xpath="//div[text()='ADD TO CART']")
	private WebElement addtocart;

	public WebElement getAddtocart() {
		return addtocart;
	}
	
	
	
	
	

}

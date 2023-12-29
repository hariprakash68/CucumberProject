package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ADMIN\\eclipse-workspace\\cucumberproject\\src\\test\\java\\com\\feature\\Lime.feature",
                 glue = "com.step",
                 plugin = {"pretty",
                 "json:Report/lime.json",
                 "html:Report1/limeroad.html",
                 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
               
}
                 )


public class RunnerClass extends BaseClass{
	
	@BeforeClass
	public static void browserLaunch() {
		launchBrowser("chrome");
	}

	

}

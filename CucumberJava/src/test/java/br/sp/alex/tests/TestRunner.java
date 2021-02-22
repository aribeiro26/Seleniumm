package br.sp.alex.tests;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(		
		features ="src/test/resources/Feature/", 
		glue = {"br.sp.alex.tests"},
		plugin = {"pretty", "html:target/report-html", "json:target/repot.json"},
		monochrome = false,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = true
		)
public class TestRunner {

}

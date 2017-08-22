package br.com.springkotlin

import cucumber.api.CucumberOptions
import cucumber.api.SnippetType
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@RunWith(Cucumber::class)
@CucumberOptions(glue = arrayOf("br.com.springkotlin.steps"), snippets = SnippetType.CAMELCASE, features = arrayOf("src/test/resources/cucumber/feature"))
class ApplicationTests {


}


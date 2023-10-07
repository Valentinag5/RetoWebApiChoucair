package co.choucair.runners.back;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/back/Crud.feature"},
        glue = {"co.choucair.stepdefinitions"},
        tags = ""

)
public class CrudRunner {
}

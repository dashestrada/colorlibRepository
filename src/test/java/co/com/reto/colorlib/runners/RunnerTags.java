package co.com.reto.colorlib.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/verificar_diligenciamiento.feature",
        tags = "@stories",
        glue = "co.com.reto.colorlib.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}

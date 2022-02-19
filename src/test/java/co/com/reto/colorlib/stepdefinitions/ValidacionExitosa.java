package co.com.reto.colorlib.stepdefinitions;

import co.com.reto.colorlib.model.ColorlibData;
import co.com.reto.colorlib.questions.*;
import co.com.reto.colorlib.tasks.EnterFormsData;
import co.com.reto.colorlib.tasks.FormEmpty;
import co.com.reto.colorlib.tasks.LoginColorlib;
import co.com.reto.colorlib.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ValidacionExitosa {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^than dayana is registered she wants to verify completion$")
    public void thanDayanaIsRegisteredSheWantsToVerifyCompletion(List<ColorlibData> datos) {
        OnStage.theActorCalled("Dayana").wasAbleTo(OpenUp.thePage(), (LoginColorlib.onThePage(datos)));
    }


    @When("^she enters all the required information$")
    public void sheEntersAllTheRequiredInformation(List<ColorlibData> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterFormsData.onThePage(datos));
    }

    @Then("^verification is successful$")
    public void verificationIsSuccessful(List<ColorlibData> datos) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Anwers.onThePage(datos)));
    }


    @Given("^that dayana wants to validate the message$")
    public void thatDayanaWantsToValidateTheMessage(List<ColorlibData> datos) {
        OnStage.theActorCalled("Dayana").wasAbleTo(OpenUp.thePage(), (LoginColorlib.onThePage(datos)));
    }

    @When("^she saves the form with empty fields$")
    public void sheSavesTheFormWithEmptyFields() {
        OnStage.theActorInTheSpotlight().attemptsTo(FormEmpty.onThePage());
    }

    @Then("^check the message$")
    public void checkTheMessage(List<ColorlibData> datos) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(EmptyAnwers.onThePage(datos)));
    }

    @Given("^that dayana wants to validate the message of the email$")
    public void thatDayanaWantsToValidateTheMessageOfTheEmail(List<ColorlibData> datos) {
        OnStage.theActorCalled("Dayana").wasAbleTo(OpenUp.thePage(), (LoginColorlib.onThePage(datos)));
    }

    @When("^she saves the form with invalid email$")
    public void sheSavesTheFormWithInvalidEmail(List<ColorlibData> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterFormsData.onThePage(datos));

    }

    @Then("^check the message of the email$")
    public void checkTheMessageOfTheEmail(List<ColorlibData> datos) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Email.onThePage(datos)));
    }

    @Given("^that dayana wants to validate the message of the password$")
    public void thatDayanaWantsToValidateTheMessageOfThePassword(List<ColorlibData> datos) {
        OnStage.theActorCalled("Dayana").wasAbleTo(OpenUp.thePage(), (LoginColorlib.onThePage(datos)));
    }

    @When("^she saves the form with invalid password$")
    public void sheSavesTheFormWithInvalidPassword(List<ColorlibData> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterFormsData.onThePage(datos));
    }

    @Then("^check the message of the password$")
    public void checkTheMessageOfThePassword(List<ColorlibData> datos) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Password.onThePage(datos)));
    }

    @Given("^that dayana wants to validate the message of the url$")
    public void thatDayanaWantsToValidateTheMessageOfTheUrl(List<ColorlibData> datos) {
        OnStage.theActorCalled("Dayana").wasAbleTo(OpenUp.thePage(), (LoginColorlib.onThePage(datos)));
    }

    @When("^she saves the form with invalid url$")
    public void sheSavesTheFormWithInvalidUrl(List<ColorlibData> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterFormsData.onThePage(datos));
    }

    @Then("^check the message of the invalid url$")
    public void checkTheMessageOfTheInvalidUrl(List<ColorlibData> datos) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Url.onThePage(datos)));
    }

    @Given("^that dayana wants to validate the message of the digits$")
    public void thatDayanaWantsToValidateTheMessageOfTheDigits(List<ColorlibData> datos) {
        OnStage.theActorCalled("Dayana").wasAbleTo(OpenUp.thePage(), (LoginColorlib.onThePage(datos)));
    }

    @When("^she saves the form with invalid digits$")
    public void sheSavesTheFormWithInvalidDigits(List<ColorlibData> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterFormsData.onThePage(datos));
    }

    @Then("^check the message of the invalid digits$")
    public void checkTheMessageOfTheInvalidDigits(List<ColorlibData> datos) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Digits.onThePage(datos)));
    }

    @Given("^that dayana wants to validate the message of the range$")
    public void thatDayanaWantsToValidateTheMessageOfTheRange(List<ColorlibData> datos) {
        OnStage.theActorCalled("Dayana").wasAbleTo(OpenUp.thePage(), (LoginColorlib.onThePage(datos)));
    }

    @When("^she saves the form with invalid range$")
    public void sheSavesTheFormWithInvalidRange(List<ColorlibData> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterFormsData.onThePage(datos));
    }

    @Then("^check the message of the invalid range$")
    public void checkTheMessageOfTheInvalidRange(List<ColorlibData> datos) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Range.onThePage(datos)));
    }

}